package org.kuali.rice.krtrain.component;

import org.kuali.rice.krad.uif.component.Component;
import org.kuali.rice.krad.uif.container.Group;
import org.kuali.rice.krad.uif.field.InputField;
import org.kuali.rice.krad.uif.modifier.ComponentModifierBase;
import org.kuali.rice.krad.uif.util.ComponentUtils;
import org.kuali.rice.krad.uif.util.ObjectPropertyUtils;
import org.kuali.rice.krad.uif.view.View;
import org.kuali.rice.krad.uif.view.ViewModel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Component modifier that tracks field value changes
 *
 * @author KRAD Training
 */
public class AuditFieldModifier extends ComponentModifierBase {
    private static final long serialVersionUID = 7425108901710448657L;

    private static final String AUDIT_HIGHLIGHT_CSS_CLASS = "audit-changed";
    private static final String EXPANSION_DATA_KEY = "AuditData";

    public void performModification(View view, Object model, Component component) {
        ViewModel viewModel = (ViewModel) model;

        Map<String, Object> initialValues = new HashMap<String, Object>();
        if (viewModel.getExtensionData().containsKey(EXPANSION_DATA_KEY)) {
            initialValues = (Map<String, Object>) viewModel.getExtensionData().get(EXPANSION_DATA_KEY);
        } else {
            viewModel.getExtensionData().put(EXPANSION_DATA_KEY, initialValues);
        }

        if (!(component instanceof Group)) {
            return;
        }
        Group group = (Group) component;

        for (Component field : ComponentUtils.getComponentsOfTypeDeep(group, InputField.class)) {
            if (!(field instanceof InputField)) {
                continue;
            }

            InputField inputField = (InputField) field;
            String propertyPath = inputField.getBindingInfo().getBindingPath();

            if (!ObjectPropertyUtils.isReadableProperty(model, propertyPath)) {
                continue;
            }

            boolean isString = false;
            Class<?> propertyType = ObjectPropertyUtils.getPropertyType(model, propertyPath);
            if (String.class.isAssignableFrom(propertyType)) {
                isString = true;
            }

            Object currentValue = ObjectPropertyUtils.getPropertyValue(model, propertyPath);
            if (currentValue == null && isString) {
                currentValue = "";
            }

            if (initialValues.containsKey(propertyPath)) {
                Object initialValue = initialValues.get(propertyPath);
                if (currentValue == null && isString) {
                    currentValue = "";
                }

                boolean changed = false;
                if (!initialValue.equals(currentValue)) {
                    changed = true;
                }

                if (changed && (inputField.getControl() != null)) {
                    inputField.getControl().getCssClasses().add(AUDIT_HIGHLIGHT_CSS_CLASS);
                }
            } else {
                initialValues.put(propertyPath, currentValue);
            }
        }
    }

    public Set<Class<? extends Component>> getSupportedComponents() {
        Set<Class<? extends Component>> components = new HashSet<Class<? extends Component>>();
        components.add(Group.class);

        return components;
    }
}
