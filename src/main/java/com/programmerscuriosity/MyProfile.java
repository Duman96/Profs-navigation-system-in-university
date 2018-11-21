package com.programmerscuriosity;

import org.glassfish.jersey.internal.util.Base64;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Arrays;
import java.util.Iterator;


@Path("profile")
public class MyProfile {

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("{id}")
    public String getUser (@PathParam("id") String id) throws IOException, SQLException {

        MySqlConnect mysqlConnect = new MySqlConnect();
        System.out.println("ID is " + id);
        System.out.println("Type of id " + ((Object) id).getClass().getName());
        int foo = Integer.parseInt(id);
        String sql = "select * from users where ID = " + foo;
        String result_n = null;
        String result_s = null;
        String result_school = null;
        String result_dep = null;
        String result_pos= null;
        String result_bio = null;



        return sql;
    }
}
