Brandon Devan
ST10442244
LINK TO REPOSITORY: https://github.com/branz8/IMADSUPP.git

pURPOSE AND EXPLANATION OF THE APP:
The Hydration Haven app is designed to help users track their daily water intake. Staying hydrated is crucial for overall health and well-being, and this app aims to make it easy and fun for users to monitor their hydration habits. By providing a simple interface for logging water intake and viewing detailed hydration data, the app encourages users to stay aware of their hydration levels and develop healthy drinking habits.
Hydration Haven is an Android application developed using Kotlin. The app consists of three primary screens: the Splash Screen, the Main Screen, and the Detailed View Screen. Each screen serves a specific purpose in guiding the user through tracking and managing their hydration data.

1. Splash Screen
Activity: SplashActivity
Layout: activity_splash.xml

Purpose:
The Splash Screen provides an initial loading screen for the app, displaying the app name and an option to exit the app.

Description:

Displays the app name "Hydration Haven".
Shows a button to exit the app.
Automatically navigates to the Main Screen after a short delay (2 seconds).
2. Main Screen
Activity: MainActivity
Layout: activity_main.xml

Purpose:
The Main Screen is the central hub of the app where users can navigate to view their detailed hydration data or clear their data.

Description:

Displays the title "Hydration Haven".
Provides a button to view hydration details.
Provides a button to clear the stored hydration data.
3. Detailed View Screen
Activity: DetailedViewActivity
Layout: activity_detailed_view.xml

Purpose:
The Detailed View Screen presents a detailed view of the user's hydration data, including water intake for the morning and afternoon along with any relevant notes.

Description:

Displays the title "Hydration Details".
Shows a list of hydration entries, including the date, morning intake, afternoon intake, and any notes.
Provides a button to navigate back to the Main Screen.
Key Features
User-Friendly Interface:

Simple and intuitive design for easy navigation.
Clear and concise display of hydration data.
Hydration Tracking:

Allows users to log their water intake for the morning and afternoon.
Stores data for detailed review.
Data Management:

Provides functionality to clear stored hydration data.
Ensures accurate and up-to-date information.
Error Handling:

Includes validation checks for user inputs to prevent incorrect data entry.
Displays error messages when invalid inputs are detected.
Navigation Flow
Splash Screen:

Displays the app name.
After a delay, transitions to the Main Screen.
Exit button to close the app.
Main Screen:

Button to navigate to the Detailed View Screen.
Button to clear hydration data.
Detailed View Screen:

Displays detailed hydration data.
Button to navigate back to the Main Screen.
By offering these features, the Hydration Haven app aims to help users maintain proper hydration and develop healthier drinking habits through easy tracking and data management.

FLOWCHART: 
START

SplashActivity.onCreate
    setContentView(activity_splash)
   Set delay (2 seconds)
    Navigate to MainActivity
     finish() SplashActivity

MainActivity.onCreate
    setContentView(activity_main)
    Set OnClickListeners for buttons
         btnViewDetails.onClick
         Navigate to DetailedViewActivity
         btnClearData.onClick
               Clear Data Logic

DetailedViewActivity.onCreate
     setContentView(activity_detailed_view)
     Set OnClickListener for btnBack
        finish() DetailedViewActivity
END

PSEUDOCODE: 
FUNCTION SplashActivity.onCreate
    CALL setContentView(activity_splash)

    SET splashScreenDuration TO 2000 milliseconds

    CALL Handler.postDelayed WITH delay: splashScreenDuration, ACTION:
        CALL startActivity WITH Intent(this, MainActivity)
        CALL finish()

END FUNCTION

FUNCTION MainActivity.onCreate
    CALL setContentView(activity_main)

    SET OnClickListener FOR btnViewDetails TO:
        CALL startActivity WITH Intent(this, DetailedViewActivity)

    SET OnClickListener FOR btnClearData TO:
        CALL clearData

END FUNCTION

FUNCTION clearData
    // Add logic to clear hydration data
END FUNCTION

FUNCTION DetailedViewActivity.onCreate
    CALL setContentView(activity_detailed_view)

    SET OnClickListener FOR btnBack TO:
        CALL finish()

END FUNCTION
 SCREENSHOTS OF APPLICATION:
 
![Screenshot (28)](https://github.com/user-attachments/assets/4dca7dab-a875-4c35-8087-f0b9530a3375)
![Screenshot (30)](https://github.com/user-attachments/assets/78e9adb4-2cbc-49c7-8455-a45a89866bd3)
![Screenshot (31)](https://github.com/user-attachments/assets/5aa26deb-571f-4cb0-bd91-5183d7c1a728)
![Screenshot (32)](https://github.com/user-attachments/assets/504d4303-5ff0-4ac7-975d-9700941f2b36)
![Screenshot (33)](https://github.com/user-attachments/assets/5f53c8f5-5398-45cc-b265-66e308fd7023)
![Screenshot (34)](https://github.com/user-attachments/assets/fcad48c1-6f3d-45c6-b5e3-352d6ca084a7)
![Screenshot (35)](https://github.com/user-attachments/assets/a02e5214-f89b-410f-9cd5-e939b1945db6)




