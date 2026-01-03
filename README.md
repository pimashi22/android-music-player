# 🎵 Android Music Player App

A simple and visually appealing **Android Music Player UI** designed using **XML**.  
This project focuses on **UI/UX principles**, layout design, color theory, and basic navigation using intents.

---
## 📌 About the App

The Android Music Player app is a clean and user-friendly mobile UI design that simulates the interface of a music playback application.  
The app demonstrates modern Android UI practices while maintaining simplicity and aesthetic balance.

---

## ⭐ Core Features

- 🎨 Clean and modern UI design
- 🎧 Music player themed interface
- 📱 Responsive layouts for different screen sizes
- 🔁 Screen navigation using **Intents**
- 📜 Scrollable UI where required
- 📐 Proper use of margins and padding

---

## 🎨 Color Scheme (60–30–10 Rule)

The app follows the **60–30–10 color rule** to ensure visual balance:

| Usage | Description |
|------|------------|
| **60% Primary Color** | Main background and dominant UI elements |
| **30% Secondary Color** | Cards, containers, and supporting UI |
| **10% Accent Color** | Buttons, highlights, and important actions |

✔ All colors are defined and managed using **`colors.xml`**

---
## 🧱 Layouts Used

The following Android layouts are used appropriately:

- **LinearLayout** (Vertical & Horizontal)
- **ConstraintLayout**
- **FrameLayout**
- **ScrollView**

✔ Adequate **margin** and **padding** applied throughout the UI

---

## 🧩 UI Components Used

- `TextView`
- `EditText`
- `Button`
- `ImageView`
- Other UI elements sourced and adapted where necessary

✔ All text values are managed using **`strings.xml`**

---
## 💡 Creativity Highlights

- Music-themed visual design
- Clean alignment and spacing
- User-friendly navigation flow
- Minimal yet attractive aesthetics

---

## 🛠️ Technologies Used

- **Android Studio**
- **XML (UI Design Only)**
- **Java** (for basic intent navigation)
- **Git & GitHub** (Version Control)

---

## 📂 Project Structure

```javascript
android-music-player/
│
├── app/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/com/example/musicplayer/
│ │ │ │ ├── MainActivity.java
│ │ │ │ └── OtherActivities.java
│ │ │ │
│ │ │ ├── res/
│ │ │ │ ├── layout/
│ │ │ │ │ ├── activity_main.xml
│ │ │ │ │ └── other_layouts.xml
│ │ │ │ │
│ │ │ │ ├── values/
│ │ │ │ │ ├── colors.xml
│ │ │ │ │ └── strings.xml
│ │ │ │
│ │ │ │ └── drawable/
│ │ │ │
│ │ │ └── AndroidManifest.xml
│
````

## 🚀 How to Run the Project in Android Studio

1. Clone the repository:
   ```bash
   git clone https://github.com/pimashi22/android-music-player.git
   ````
2. Open Android Studio 
3. Click File → Open
4. Select the cloned project folder
5. Let Gradle sync complete
6. Run the app using:
   - Emulator or
   - Physical Android device
