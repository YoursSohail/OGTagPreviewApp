# OG Tag Previewer in Jetpack Compose

![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-1.5.0-blue)
![Jsoup](https://img.shields.io/badge/Jsoup-1.16.1-green)
![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-orange)

This is a simple Android application built with Jetpack Compose that allows users to input a URL and fetch its Open Graph (OG) tag data, displaying a preview with the title, description, and image (if available). The app uses [Jsoup](https://jsoup.org/) for HTML parsing to extract OG tags directly from the provided URL.

## Features

- **User Input:** Users can input any URL.
- **OG Tag Fetching:** Fetches OG tags like title, description, and image from the input URL using Jsoup.
- **Modern UI:** The app has a sleek and modern UI designed with Jetpack Compose.
- **Real-Time Preview:** Displays the OG tag preview in real-time after the user clicks the "Fetch Preview" button.

## Screenshots
<img src="https://github.com/user-attachments/assets/40bcd2d7-bd46-4f53-bc73-11910a6f64ec" height=400/>
<img src="https://github.com/user-attachments/assets/d5ce8991-46fb-47d5-badb-577b60ee36e9" height=400/>

## Getting Started

### Prerequisites

- Android Studio Bumblebee or newer
- Kotlin 1.9.0 or newer
- Android SDK 21 or newer

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/og-tag-previewer.git
   cd og-tag-previewer
   
2. **Open the project:**

   Open the project in Android Studio.

3. **Build the project:**

   Let Gradle sync and build the project. Make sure you have the necessary SDK and libraries installed.

### Dependencies

The project relies on the following dependencies:

```gradle
dependencies {
    // Jsoup for HTML fetching and parsing
    implementation("org.jsoup:jsoup:1.16.1")

    // Coil for image loading
    implementation("io.coil-kt:coil-compose:2.2.2")
}
```
## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

