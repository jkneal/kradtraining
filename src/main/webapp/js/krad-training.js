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

}

function checkReview() {

}

