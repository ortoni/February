WinWaitActive("Authentication Required","","20")
 If WinExists("Authentication Required") Then
 Send("Madmin{TAB}")
 Send("Micr0.com{Enter}")
 EndIf