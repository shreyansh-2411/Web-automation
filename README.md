# Web Automation Project
This project is a comprehensive web automation solution utilizing Selenium, TestNG, and Cucumber in a Maven project. It is designed to perform various actions on a website, demonstrating robust testing capabilities and practices.

Features
Configurable Settings: The project supports reading configuration settings from a JSON file, allowing for easy customization and flexibility.
Automated Reporting: Extent Reports are automatically generated at the end of each test, providing detailed insights and visual representations of the test results.
Feature Files: The project includes three feature files:
Login Feature: Demonstrates a simple automation script for logging into a website.
Frame Feature: Illustrates handling of iframes within web pages.
Windows Feature: Shows how to manage and interact with multiple browser windows.
Project Structure
All files are properly organized, adhering to Maven testing framework standards. The components are modular, ensuring maintainability and scalability.

Dependencies
The project utilizes the following primary dependencies:

Selenium
TestNG
Cucumber
Extent Reports
Getting Started
Clone the repository:

bash
Copy code
git clone https://github.com/your-repo/web-automation-project.git
Navigate to the project directory:

bash
Copy code
cd web-automation-project
Install dependencies:

bash
Copy code
mvn clean install
Run the tests:

bash
Copy code
mvn test
Configuration
Edit the config.json file to customize the settings as needed. This file includes various configuration parameters required for the tests.

Reporting
After running the tests, the Extent Reports will be generated automatically. You can find the reports in the reports directory.

Contributing
We welcome contributions to enhance this project. Please follow the standard Git workflow:

Fork the repository
Create a new branch (git checkout -b feature-branch)
Make your changes
Commit your changes (git commit -m 'Add some feature')
Push to the branch (git push origin feature-branch)
Create a new Pull Request
License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
For any questions or feedback, please contact shreyanshchandel2411@gmail.com
