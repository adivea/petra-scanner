package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Scan_Record
     */
    public static View get_ScanRecord(Solo solo) {
        String ref = "Scan_Record";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  User
     */
    public static View get_User(Solo solo) {
        String ref = "User";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/Control
     */
    public static View get_Control_Control(Solo solo) {
        String ref = "Control/Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Search
     */
    public static View get_Control_Search(Solo solo) {
        String ref = "Control/Search";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Scan_Record/Files
     */
    public static View get_ScanRecord_Files(Solo solo) {
        String ref = "Scan_Record/Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Scan_Record/Notes
     */
    public static View get_ScanRecord_Notes(Solo solo) {
        String ref = "Scan_Record/Notes";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Scan_Record/Tab
     */
    public static View get_ScanRecord_Tab(Solo solo) {
        String ref = "Scan_Record/Tab";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  User/User
     */
    public static View get_User_User(Solo solo) {
        String ref = "User/User";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Control/Create_New_Record
     */
    public static View get_Control_Control_CreateNewRecord(Solo solo) {
        String ref = "Control/Control/Create_New_Record";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Scan_Record/Files/Button_Files
     */
    public static View get_ScanRecord_Files_ButtonFiles(Solo solo) {
        String ref = "Scan_Record/Files/Button_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Scan_Record/Tab/Attach_New_Files
     */
    public static View get_ScanRecord_Tab_AttachNewFiles(Solo solo) {
        String ref = "Scan_Record/Tab/Attach_New_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Anthropology
     */
    public static View get_ScanRecord_Tab_ThemeAnthropology(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Anthropology";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Archaeology
     */
    public static View get_ScanRecord_Tab_ThemeArchaeology(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Archaeology";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Date
     */
    public static View get_ScanRecord_Tab_ThemeDate(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Date";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Epigraphy
     */
    public static View get_ScanRecord_Tab_ThemeEpigraphy(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Epigraphy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Geography
     */
    public static View get_ScanRecord_Tab_ThemeGeography(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Geography";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_History
     */
    public static View get_ScanRecord_Tab_ThemeHistory(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_History";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Other
     */
    public static View get_ScanRecord_Tab_ThemeOther(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Other";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Research_Topics
     */
    public static View get_ScanRecord_Tab_ThemeResearchTopics(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Research_Topics";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Scan_Record/Tab/Theme_Thrace
     */
    public static View get_ScanRecord_Tab_ThemeThrace(Solo solo) {
        String ref = "Scan_Record/Tab/Theme_Thrace";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Scan_Record/Files/Files
     */
    public static View get_ScanRecord_Files_Files(Solo solo) {
        String ref = "Scan_Record/Files/Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Scan_Record/Tab/File_Type
     */
    public static View get_ScanRecord_Tab_FileType(Solo solo) {
        String ref = "Scan_Record/Tab/File_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Scan_Record/Tab/Language
     */
    public static View get_ScanRecord_Tab_Language(Solo solo) {
        String ref = "Scan_Record/Tab/Language";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Scan_Record/Tab/Origin
     */
    public static View get_ScanRecord_Tab_Origin(Solo solo) {
        String ref = "Scan_Record/Tab/Origin";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Scan_Record/Tab/Research
     */
    public static View get_ScanRecord_Tab_Research(Solo solo) {
        String ref = "Scan_Record/Tab/Research";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Control/Next_ID
     */
    public static View get_Control_Control_NextID(Solo solo) {
        String ref = "Control/Control/Next_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Entity_Types
     */
    public static EditText get_Control_Search_EntityTypes(Solo solo) {
        String ref = "Control/Search/Entity_Types";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Notes/Notes
     */
    public static EditText get_ScanRecord_Notes_Notes(Solo solo) {
        String ref = "Scan_Record/Notes/Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Author_First_Name
     */
    public static EditText get_ScanRecord_Tab_AuthorFirstName(Solo solo) {
        String ref = "Scan_Record/Tab/Author_First_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Author_Last_name
     */
    public static EditText get_ScanRecord_Tab_AuthorLastname(Solo solo) {
        String ref = "Scan_Record/Tab/Author_Last_name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Book_Title
     */
    public static EditText get_ScanRecord_Tab_BookTitle(Solo solo) {
        String ref = "Scan_Record/Tab/Book_Title";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Chapter
     */
    public static EditText get_ScanRecord_Tab_Chapter(Solo solo) {
        String ref = "Scan_Record/Tab/Chapter";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/End_Page
     */
    public static EditText get_ScanRecord_Tab_EndPage(Solo solo) {
        String ref = "Scan_Record/Tab/End_Page";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/File_Reference
     */
    public static EditText get_ScanRecord_Tab_FileReference(Solo solo) {
        String ref = "Scan_Record/Tab/File_Reference";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/ID
     */
    public static EditText get_ScanRecord_Tab_ID(Solo solo) {
        String ref = "Scan_Record/Tab/ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Issue
     */
    public static EditText get_ScanRecord_Tab_Issue(Solo solo) {
        String ref = "Scan_Record/Tab/Issue";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Journal
     */
    public static EditText get_ScanRecord_Tab_Journal(Solo solo) {
        String ref = "Scan_Record/Tab/Journal";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/PDF_Output_Name
     */
    public static EditText get_ScanRecord_Tab_PDFOutputName(Solo solo) {
        String ref = "Scan_Record/Tab/PDF_Output_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Start_Page
     */
    public static EditText get_ScanRecord_Tab_StartPage(Solo solo) {
        String ref = "Scan_Record/Tab/Start_Page";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Volume
     */
    public static EditText get_ScanRecord_Tab_Volume(Solo solo) {
        String ref = "Scan_Record/Tab/Volume";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Scan_Record/Tab/Year
     */
    public static EditText get_ScanRecord_Tab_Year(Solo solo) {
        String ref = "Scan_Record/Tab/Year";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  User/User/Users
     */
    public static View get_User_User_Users(Solo solo) {
        String ref = "User/User/Users";
        return (android.view.View) solo.getView((Object) ref);
    }
}
