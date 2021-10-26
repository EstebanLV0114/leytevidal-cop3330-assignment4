import org.junit.jupiter.api.Test;

//Based upon future implementaions of the program...

class ControllerTest
{
    @Test
    void EditDate()
    {
        //retrieve list -> retrieve information of the list -> prompt user to edit due date -> check and see if due date is correct
    }
    @Test
    void EditDesc()
    {
        //retrieve list -> retrieve information of the item -> edit desc. -> check to see if description is correct
    }

    @Test
    void NewItem()
    {
        //retrieve viewable list of items -> retrieve information of the items -> add item to the list -> check to see if the size has increased
    }

    @Test
    void RemoveItem()
    {
        //retrieve list of items -> retrieve information of the item -> search item in the list and delete -> check and see if item in list
    }

    @Test
    void ChangeStatus()
    {
        //retrieve list of items -> retrieve information of the item -> search item in the list and change status -> check and see if status was changed
    }

    @Test
    void ViewIncomplete()
    {
        //retrieve list of items -> loop and retrieve ONLY the incomplete items -> check to see if the status is true to change
    }

    @Test
    void ViewComplete()
    {
        //retrieve list of items -> loop and retrieve ONLY the complete items -> check and see if the amount of complete is equal to expected value
    }

    @Test
    void ViewLists()
    {
        //retrieve list of items -> check and see if items displayed are equal to expected size of list
    }

    @Test
    void SaveList()
    {
        //retrieve list of items and filepath -> write items in a single list to a file -> check and see if file matches test file -> retrieve list of items and filepath
        //write all items in the many lists to a file -> check and see if file matches test file
    }

    @Test
    void LoadList()
    {
        //retrieve the file and file path -> read all items to list -> check to see if list matches expected list
    }


    @Test
    void EditTitle()
    {
        //retrieve name to be changed -> Edit title on the window -> clear text box of what was entered -> check and see that the title has been changed
    }

    @Test
    void DeleteList()
    {
        //delete the list being used -> check and see that the list being used is empty
    }
}