# Multiple Image Downloader
The Multiple Image Downloader is a Java-based application that uses the powerful Jsoup library to scrape images from web pages. This project demonstrates how to download multiple images from a webpage by parsing the HTML and extracting image URLs. The application supports multiple image downloads simultaneously, making it efficient and easy to use.

The project is built with Gradle as the build automation tool, and it is structured in a way that you can extend and customize the logic for various use cases, such as scraping different types of images (e.g., wallpapers, product images, etc.).

## Features
1. Web Scraping: Uses Jsoup to extract image URLs from any given HTML page.
2. Multiple Image Downloading: Supports downloading multiple images concurrently.
3. Gradle Build: Automated build system using Gradle for dependency management and project setup. 
4. Image Format Support: Downloads common image formats like .jpg, .png, & .jpeg. 
5. Error Handling: Basic error handling to deal with inaccessible URLs or missing images. 
6. Easy to Use: Command-line interface (CLI) for user input and interactions.

## Example Downloaded Wallpaper
Here is a sample folder named - Wallpaper with images downloaded from website:
https://www.uhdpaper.com/search?q=Animals&by-date=true

## Technology and Concepts Covered
1. Java
2. Jsoup
3. Gradle
4. File I/O
5. Concurrency