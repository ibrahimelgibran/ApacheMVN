package iegcode.maven;

import com.google.gson.Gson;


public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();

        Person person = new Person("Ibrahim El Gibran");
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
