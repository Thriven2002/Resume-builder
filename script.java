
document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('resume-form');
    const previewContent = document.getElementById('preview-content');
    const resumePreview = document.getElementById('resume-preview');
    const downloadPdfButton = document.getElementById('download-pdf');

    form.addEventListener('submit', function(event) {
        event.preventDefault();
        const formData = new FormData(form);
        let htmlContent = '';

        // Build HTML content for preview
        formData.forEach((value, key) => {
            htmlContent += `<p><strong>${key}:</strong> ${value}</p>`;
        });

        // Display preview
        previewContent.innerHTML = htmlContent;
        resumePreview.classList.remove('hidden');
    });

    downloadPdfButton.addEventListener('click', function() {
        // Assuming you have implemented PDF generation logic here
        alert('PDF generation feature is not implemented yet!');
    });
});
