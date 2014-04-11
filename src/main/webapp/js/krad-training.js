function reorderIds() {
    alert("Ids have been reordered!");
}

function clearForm() {
    jQuery("#kualiForm").clearForm();
}

function promptBeforeSave() {
    var bookTitle =  coerceValue("book.title");

    var response = confirm("Are you sure you want to save the book: " + bookTitle + "?");

    return response;
}

function setupReviewCheck() {
    jQuery("input[name='book.averageReview']").click(checkReview);
}

function checkReview() {
    var value = jQuery(this).val();
    if (value == 5) {
        jQuery("#averageReview_markers").html("<b>Awesome!</b>");
    }
    else {
        jQuery("#averageReview_markers").html("");
    }
}

function awardDialogHandler(event) {
    alert('You selected award: ' + event.response);
}

