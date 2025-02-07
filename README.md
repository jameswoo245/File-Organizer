# 📂 File Organizer  

A simple and efficient **File Organizer** that automatically sorts files into categorized folders based on their extensions. This tool helps keep your directories clean and organized.  

## 🚀 Features  
- Automatically moves files into categorized folders (e.g., Documents, Images, Videos, Music).  
- Supports a wide range of file extensions.  
- Lightweight and easy to use.  
- Customizable categories for better organization.  
- Works efficiently on local directories.  
- Can be run as an **executable** file for ease of use.  

## 🛠️ Installation  
1. Clone this repository:  
   ```bash
   git clone https://github.com/jameswoo245/File-Organizer.git
   ```  
2. Navigate to the project folder:  
   ```bash
   cd File-Organizer
   ```  
3. Install required dependencies (if applicable):  
   ```bash
   pip install -r requirements.txt
   ```  

## 🎯 Usage  
### Run as a Python script:  
1. Execute the script:  
   ```bash
   python file_organizer.py
   ```  
2. The script will scan the specified directory and automatically organize files into categorized folders.  

### Run as an Executable:  
1. Convert the script into an executable using **PyInstaller**:  
   ```bash
   pyinstaller --onefile file_organizer.py
   ```  
2. After the build completes, find the **executable** inside the `dist/` folder:  
   - **Windows:** `dist/file_organizer.exe`  
   - **Mac/Linux:** `dist/file_organizer`  
3. Run the executable directly:  
   - **Windows:** Double-click `file_organizer.exe` or run in the terminal:  
     ```bash
     ./dist/file_organizer.exe
     ```  
   - **Mac/Linux:**  
     ```bash
     ./dist/file_organizer
     ```  

## 📝 Customization  
- You can modify file categories by editing the **configuration settings** in the script.  
- Add or remove file extensions as needed.  

## 📷 Example  
Before running the script:  
```
Downloads/
│── image1.jpg  
│── document.pdf  
│── music.mp3  
│── video.mp4  
```  
After running the script:  
```
Downloads/
│── Images/
│   └── image1.jpg  
│── Documents/
│   └── document.pdf  
│── Music/
│   └── music.mp3  
│── Videos/
│   └── video.mp4  
```  

## 📌 Contributing  
Feel free to submit pull requests or report issues. Any contributions to improve this project are welcome! 
