# Stealth Protect

Stealth Protect is a security tool designed to run at startup on Windows systems. It waits 10 seconds and then checks if a file named `IAMHERE` exists on your desktop. If the file is not found, the program will initiate a system shutdown. This acts as a security measure to ensure that only authorized users who know to create the file can keep the system running.

## Features

- **Security and Privacy:** Ensures the computer is used only by those who know the security measure.
- **Easy Installation:** Simply install the JAR file from the releases page and add it to your startup folder.
- **Compatibility:** Works exclusively on Windows systems.

## Installation

1. Ensure you have Java installed on your system.
2. Download the JAR file from the [releases page](https://github.com/z3co/PasswordFolder/releases).
3. Place the JAR file in your startup folder:
   - Press `Win + R` to open the Run dialog, type `shell:startup`, and press Enter.
   - Copy the JAR file to the opened folder.

## Usage

1. Make sure Java is installed on your system.
2. Place the JAR file in your startup folder as described above.
3. Every time your computer starts, the program will wait for 10 seconds and then check for the `IAMHERE` file on your desktop. If the file is not found, the computer will shut down.

## Contributing

We welcome contributions to improve PasswordFolder. You can contribute by opening an issue or submitting a pull request on GitHub. For further inquiries, you can also reach out via email at Jepper123411@proton.me.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For questions or support, you can contact us by:
- Opening an issue or pull request on GitHub
- Sending an email to Jepper123411@proton.me
