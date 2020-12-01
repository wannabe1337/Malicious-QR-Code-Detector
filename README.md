# Malicious-QR-Code-Scanner
A mini-project in Java. It's purpose is to scan the "QR code" of given image and then shows the URL.
It not only shows the URLs but also checks the URLs within its database of malicious links.

It uses ZXing library to read the "QR Code". ZXing ("zebra crossing") is an open-source, multi-format 1D/2D barcode image processing library implemented in Java.
After resolving the "QR Code", it makes the DB connection with mySQL and then checks the value of QR Code within its database of malicious links.

In this ZIP file, there is two different folders, one contains the original source code and other contains some QR code images and executable JAR file, 
before executing JAR file please read "QR Code Scanner Requirement.txt" file.
