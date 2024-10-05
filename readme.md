# Mobile Automation Project for "Todo List" App

This project automates the testing of the **Todo List** mobile app using **Appium**. The tests cover core functionality such as adding, editing, deleting, and marking tasks as complete. The automation is designed to run on both Android and iOS devices.

## Features of the Automation Suite

- **Cross-platform**: Supports both Android and iOS testing using Appium.
- **Test Scenarios**: Covers key CRUD operations for tasks (Create, Read, Update, Delete).
- **Automated Test Execution**: Tests are designed for execution on local devices and emulators/simulators.
- **Detailed Reporting**: Generates test reports for tracking test execution results.
- **Page Object Model (POM)**: Implements the Page Object Model for better maintainability and scalability of tests.

## Table of Contents

- [Pre-requisites](#pre-requisites)
- [Setup Instructions](#setup-instructions)
- [Running Tests](#running-tests)
- [Writing New Tests](#writing-new-tests)
- [Reporting](#reporting)
- [Contributing](#contributing)
- [License](#license)


## Pre-requisites

Ensure the following are installed on your machine:

1. **JDK** (Java Development Kit) - Version 8 or higher.
2. **Appium Server** - Download and install from [Appium](https://appium.io/).
3. **Android SDK** (for Android testing) - Ensure you have Android Studio and SDK tools installed.
4. **Xcode** (for iOS testing) - Install if you are running iOS tests (macOS only).
5. **Maven** - For dependency management and test execution.
6. **Node.js** - Required for Appium to work.
7. **Appium Inspector** - Useful for inspecting elements on mobile apps.

## Setup Instructions

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/todo-app-automation.git
   ```

2. Navigate to the project directory:

   ```bash
   cd todo-app-automation
   ```

3. Install the project dependencies:

   ```bash
   mvn clean install
   ```

4. Set up the Appium server:

   ```bash
   appium
   ```

5. Configure your **Android** or **iOS** device/emulator by updating the desired capabilities in `src/main/resources/config.properties`.

### Sample Desired Capabilities Configuration for Android:
```properties
platformName=Android
deviceName=emulator-5554
platformVersion=11.0
appPackage=com.todo.list
appActivity=com.todo.list.MainActivity
automationName=UiAutomator2
```

### Sample Desired Capabilities Configuration for iOS:
```properties
platformName=iOS
deviceName=iPhone Simulator
platformVersion=14.5
app=/path/to/todolist.app
automationName=XCUITest
```

## Running Tests

To run the tests on a connected Android device or emulator:

```bash
mvn test -Dplatform=android
```

To run the tests on an iOS simulator:

```bash
mvn test -Dplatform=ios
```

## Writing New Tests

1. Navigate to `src/main/java/com/todolist/automation/tests/`.
2. Create a new test class following the format of existing tests.
3. Use the **Page Object Model** by extending the relevant page class found in `src/main/java/com/todolist/automation/pages/`.

### Example Test (Add Task Scenario):
```java
public class AddTaskTest extends BaseTest {

    @Test
    public void testAddNewTask() {
        TodoListPage todoListPage = new TodoListPage(driver);
        todoListPage.addNewTask("Buy groceries", "Buy fruits and vegetables");
        assertTrue(todoListPage.isTaskAdded("Buy groceries"));
    }
}
```

## Reporting

- The automation suite generates detailed test execution reports in the `target/surefire-reports` directory.
- **Extent Reports** integration can be added for rich HTML reports. To enable, configure it in `pom.xml` and test setup files.

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a Pull Request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```

### Key Points:
- The structure includes a **Page Object Model** for maintaining test scripts.
- A **Maven** build setup is used for dependency management and running tests.
- Sample desired capabilities and test example included to help new contributors get started.
- Reporting configuration can be enhanced with tools like **Extent Reports** if desired.

## [Buy me a Coffee☕](<https://ko-fi.com/mohamedsaidibrahim>)

If you enjoy this content and want to support me, feel free to [buy me a coffee](<https://ko-fi.com/mohamedsaidibrahim>)
