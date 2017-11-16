package com.tencent.mm.sdk.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public abstract class c
{
  public long vmr;
  
  public c()
  {
    GMTrace.i(13964012421120L, 104040);
    this.vmr = -1L;
    GMTrace.o(13964012421120L, 104040);
  }
  
  public static String a(Field paramField)
  {
    GMTrace.i(13964951945216L, 104047);
    if (paramField == null)
    {
      GMTrace.o(13964951945216L, 104047);
      return null;
    }
    paramField = paramField.getName();
    if ((paramField == null) || (paramField.length() <= 0))
    {
      GMTrace.o(13964951945216L, 104047);
      return null;
    }
    if (paramField.startsWith("field_"))
    {
      paramField = paramField.substring(6);
      GMTrace.o(13964951945216L, 104047);
      return paramField;
    }
    GMTrace.o(13964951945216L, 104047);
    return paramField;
  }
  
  public static boolean a(ContentValues paramContentValues, Cursor paramCursor)
  {
    GMTrace.i(13965220380672L, 104049);
    if (paramContentValues == null)
    {
      if (paramCursor == null)
      {
        GMTrace.o(13965220380672L, 104049);
        return true;
      }
      GMTrace.o(13965220380672L, 104049);
      return false;
    }
    if ((paramCursor == null) || (paramCursor.getCount() != 1))
    {
      GMTrace.o(13965220380672L, 104049);
      return false;
    }
    paramCursor.moveToFirst();
    int k = paramCursor.getColumnCount();
    int j = paramContentValues.size();
    int i = j;
    if (paramContentValues.containsKey("rowid")) {
      i = j - 1;
    }
    j = k;
    if (paramCursor.getColumnIndex("rowid") != -1) {
      j = k - 1;
    }
    if (i != j)
    {
      GMTrace.o(13965220380672L, 104049);
      return false;
    }
    for (;;)
    {
      try
      {
        Iterator localIterator = paramContentValues.valueSet().iterator();
        if (localIterator.hasNext())
        {
          Object localObject1 = (String)((Map.Entry)localIterator.next()).getKey();
          if (((String)localObject1).equals("rowid")) {
            continue;
          }
          i = paramCursor.getColumnIndex((String)localObject1);
          if (i == -1)
          {
            GMTrace.o(13965220380672L, 104049);
            return false;
          }
          if ((paramContentValues.get((String)localObject1) instanceof byte[]))
          {
            localObject1 = (byte[])paramContentValues.get((String)localObject1);
            localObject2 = paramCursor.getBlob(i);
            if ((localObject1 == null) && (localObject2 == null)) {
              break label465;
            }
            if ((localObject1 == null) && (localObject2 != null))
            {
              i = 0;
              if (i == 0)
              {
                GMTrace.o(13965220380672L, 104049);
                return false;
              }
            }
            else
            {
              if ((localObject1 != null) && (localObject2 == null))
              {
                i = 0;
                continue;
              }
              if (localObject1.length == localObject2.length) {
                break label453;
              }
              i = 0;
              continue;
              if (i >= localObject1.length) {
                break label465;
              }
              if (localObject1[i] == localObject2[i]) {
                break label458;
              }
              i = 0;
              continue;
            }
            continue;
          }
          if (paramCursor.getString(i) == null)
          {
            localObject2 = paramContentValues.get((String)localObject1);
            if (localObject2 != null)
            {
              GMTrace.o(13965220380672L, 104049);
              return false;
            }
          }
          Object localObject2 = paramContentValues.get((String)localObject1);
          if (localObject2 == null)
          {
            GMTrace.o(13965220380672L, 104049);
            return false;
          }
          boolean bool = paramContentValues.get((String)localObject1).toString().equals(paramCursor.getString(i));
          if (bool) {
            continue;
          }
          GMTrace.o(13965220380672L, 104049);
          return false;
        }
      }
      catch (Exception paramContentValues)
      {
        w.printErrStackTrace("MicroMsg.SDK.IAutoDBItem", paramContentValues, "", new Object[0]);
        GMTrace.o(13965220380672L, 104049);
        return false;
      }
      GMTrace.o(13965220380672L, 104049);
      return true;
      label453:
      i = 0;
      continue;
      label458:
      i += 1;
      continue;
      label465:
      i = 1;
    }
  }
  
  private static String[] a(Field[] paramArrayOfField)
  {
    GMTrace.i(13964549292032L, 104044);
    String[] arrayOfString = new String[paramArrayOfField.length + 1];
    int i = 0;
    if (i < paramArrayOfField.length)
    {
      arrayOfString[i] = a(paramArrayOfField[i]);
      String str = "getFullColumns failed:" + paramArrayOfField[i].getName();
      if (!bg.nm(arrayOfString[i])) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(str, bool);
        i += 1;
        break;
      }
    }
    arrayOfString[paramArrayOfField.length] = "rowid";
    GMTrace.o(13964549292032L, 104044);
    return arrayOfString;
  }
  
  private static Map<String, String> b(Field[] paramArrayOfField)
  {
    GMTrace.i(13964683509760L, 104045);
    HashMap localHashMap = new HashMap();
    int i = 0;
    if (i < paramArrayOfField.length)
    {
      Object localObject = paramArrayOfField[i];
      String str = b.v(((Field)localObject).getType());
      if (str == null) {
        w.e("MicroMsg.SDK.IAutoDBItem", "failed identify on column: " + ((Field)localObject).getName() + ", skipped");
      }
      for (;;)
      {
        i += 1;
        break;
        localObject = a((Field)localObject);
        if (!bg.nm((String)localObject)) {
          localHashMap.put(localObject, str);
        }
      }
    }
    GMTrace.o(13964683509760L, 104045);
    return localHashMap;
  }
  
  private static String c(Field[] paramArrayOfField)
  {
    GMTrace.i(13964817727488L, 104046);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    Field localField;
    Object localObject;
    String str2;
    String str1;
    if (i < paramArrayOfField.length)
    {
      localField = paramArrayOfField[i];
      localObject = b.v(localField.getType());
      if (localObject == null) {
        w.e("MicroMsg.SDK.IAutoDBItem", "failed identify on column: " + localField.getName() + ", skipped");
      }
      do
      {
        i += 1;
        break;
        str2 = a(localField);
      } while (bg.nm(str2));
      if (!localField.isAnnotationPresent(h.class)) {
        break label259;
      }
      str1 = " default '" + ((h)localField.getAnnotation(h.class)).bRl() + "' ";
    }
    for (int j = ((h)localField.getAnnotation(h.class)).bRm();; j = 0)
    {
      localObject = new StringBuilder().append(str2).append(" ").append((String)localObject).append(str1);
      if (j == 1)
      {
        str1 = " PRIMARY KEY ";
        label195:
        localStringBuilder.append(str1);
        if (i != paramArrayOfField.length - 1) {
          break label237;
        }
      }
      label237:
      for (str1 = "";; str1 = ", ")
      {
        localStringBuilder.append(str1);
        break;
        str1 = "";
        break label195;
      }
      paramArrayOfField = localStringBuilder.toString();
      GMTrace.o(13964817727488L, 104046);
      return paramArrayOfField;
      label259:
      str1 = "";
    }
  }
  
  public static a w(Class<?> paramClass)
  {
    GMTrace.i(20319892930560L, 151395);
    a locala = new a();
    LinkedList localLinkedList = new LinkedList();
    Field[] arrayOfField = paramClass.getDeclaredFields();
    int j = arrayOfField.length;
    int i = 0;
    if (i < j)
    {
      Field localField = arrayOfField[i];
      int k = localField.getModifiers();
      String str = localField.getName();
      if ((str != null) && (Modifier.isPublic(k)) && (!Modifier.isFinal(k)))
      {
        if (!str.startsWith("field_")) {
          break label174;
        }
        paramClass = str.substring(6);
        label99:
        if (!localField.isAnnotationPresent(h.class)) {
          break label180;
        }
        if (((h)localField.getAnnotation(h.class)).bRm() == 1) {
          locala.vms = paramClass;
        }
      }
      for (;;)
      {
        if (!bg.nm(paramClass))
        {
          if (paramClass.equals("rowid")) {
            Assert.assertTrue("field_rowid reserved by MAutoDBItem, change now!", false);
          }
          localLinkedList.add(localField);
        }
        label174:
        label180:
        do
        {
          i += 1;
          break;
          paramClass = str;
          break label99;
        } while (!str.startsWith("field_"));
      }
    }
    locala.gZM = ((Field[])localLinkedList.toArray(new Field[0]));
    locala.columns = a(locala.gZM);
    locala.vmt = b(locala.gZM);
    locala.vmu = c(locala.gZM);
    GMTrace.o(20319892930560L, 151395);
    return locala;
  }
  
  public abstract void b(Cursor paramCursor);
  
  public abstract ContentValues qL();
  
  public abstract a uw();
  
  public static final class a
  {
    public String[] columns;
    public Field[] gZM;
    public String vms;
    public Map<String, String> vmt;
    public String vmu;
    
    public a()
    {
      GMTrace.i(13966294122496L, 104057);
      this.vmt = new HashMap();
      GMTrace.o(13966294122496L, 104057);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */