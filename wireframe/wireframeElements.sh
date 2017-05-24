#!/bin/bash

./makeElement.sh style_orientation_orientation "horizontal" input 1 false false false false false .
./makeElement.sh style_even_layout_weight "1" input 1 false false false false false .
./makeElement.sh style_large_layout_weight "3" input 1 false false false false false .
./makeElement.sh User_User_Users "Users" list 1 false false false false false .
./makeElement.sh Control_Control_Next_ID "Next ID" input 1 false false false true false .
./makeElement.sh Control_Control_Create_New_Record "Create New Record" button 1 false false false false false .
./makeElement.sh Control_Search_Search_Term "Search Term" input 2 false false false false false .
./makeElement.sh Control_Search_Search_Button "Search Button" button 2 false false false false false .
./makeElement.sh Control_Search_Entity_List "Entity List" list 1 false false false false false .
./makeElement.sh Scan_Record_Tab_ID "ID" input 1 false false true true false .
./makeElement.sh Scan_Record_Tab_Attach_New_Files "Attach New Files" button 1 false false false false false .
./makeElement.sh Scan_Record_Tab_File_Type "File Type" dropdown 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Language "Language" dropdown 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Origin "Origin" dropdown 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Research "Research" dropdown 1 false false true false false .
./makeElement.sh Scan_Record_Tab_PDF_Output_Name "PDF Output Name" input 1 false false true true false .
./makeElement.sh Scan_Record_Tab_Author_Last_name "Author Last name" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Author_First_Name "Author First Name" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Year "Year" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Book_Title "Book Title" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Chapter "Chapter" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Journal "Journal" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Volume "Volume" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Issue "Issue" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Start_Page "Start Page" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_End_Page "End Page" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_File_Reference "File Reference" input 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Epigraphy "Theme: Epigraphy" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Thrace "Theme: Thrace" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Archaeology "Theme: Archaeology" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Anthropology "Theme: Anthropology" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_History "Theme: History" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Geography "Theme: Geography" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Research_Topics "Theme: Research Topics" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Date "Theme: Date" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Tab_Theme_Other "Theme: Other" checkbox 1 false false true false false .
./makeElement.sh Scan_Record_Notes_Notes "Notes" input 1 false false true false false .
./makeElement.sh Scan_Record_Files_Files "Files" file 1 false false true false false .
./makeElement.sh Scan_Record_Files_Files_Button_1 "Files" button 1 false false false false false .

dot -Tsvg datastruct.gv > wireframe.svg
#rm *.xml
#rm *.datastruct.gv
#rm *.wireframeElements.sh

