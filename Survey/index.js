const surveyForm = document.getElementById("surveyForm");
const submitButton = document.getElementById("submitButton");

submitButton.addEventListener("click", function(event) {
  event.preventDefault();

  // Validate the form
  if (!surveyForm.checkValidity()) {
    return;
  }

  // Get the selected values
  const firstName = surveyForm.elements["firstName"].value;
  const lastName = surveyForm.elements["lastName"].value;
  const dateOfBirth = surveyForm.elements["dateOfBirth"].value;
  const country = surveyForm.elements["country"].value;
  const gender = surveyForm.elements["gender"].value;
  const profession = surveyForm.elements["profession"].value;
  const email = surveyForm.elements["email"].value;
  const mobileNumber = surveyForm.elements["mobileNumber"].value;

  // Display the popup
  const popup = document.createElement("div");
  popup.classList.add("popup");

  const popupContent = document.createElement("div");
  popupContent.classList.add("popup-content");

  popupContent.innerHTML = `
    <h2>Survey Results</h2>
    <ul>
      <li>First Name: ${firstName}</li>
      <li>Last Name: ${lastName}</li>
      <li>Date of Birth: ${dateOfBirth}</li>
      <li>Country: ${country}</li>
      <li>Gender: ${gender}</li>
      <li>Profession: ${profession}</li>
      <li>Email: ${email}</li>
      <li>Mobile Number: ${mobileNumber}</li>
    </ul>
  `;

  popup.appendChild(popupContent);

  document.body.appendChild(popup);

  // Close the popup on click
  popup.addEventListener("click", function(event) {
    event.stopPropagation();

    document.body.removeChild(popup);

    // Reset the form
    surveyForm.reset();
  });
});
