package com.tencent.mm.cache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MCacheItem
  implements Parcelable
{
  public static final Parcelable.Creator<MCacheItem> CREATOR;
  private c fMn;
  
  static
  {
    GMTrace.i(13640950349824L, 101633);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(13640950349824L, 101633);
  }
  
  public MCacheItem(Parcel paramParcel)
  {
    GMTrace.i(13640279261184L, 101628);
    this.fMn = c(paramParcel);
    GMTrace.o(13640279261184L, 101628);
  }
  
  public MCacheItem(c paramc)
  {
    GMTrace.i(13640413478912L, 101629);
    this.fMn = paramc;
    GMTrace.o(13640413478912L, 101629);
  }
  
  /* Error */
  private c c(Parcel paramParcel)
  {
    // Byte code:
    //   0: ldc2_w 54
    //   3: ldc 56
    //   5: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: invokevirtual 62	android/os/Parcel:readString	()Ljava/lang/String;
    //   12: invokestatic 68	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   15: astore 4
    //   17: aload_0
    //   18: aload 4
    //   20: invokevirtual 72	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   23: checkcast 74	com/tencent/mm/sdk/e/c
    //   26: putfield 47	com/tencent/mm/cache/MCacheItem:fMn	Lcom/tencent/mm/sdk/e/c;
    //   29: aload 4
    //   31: invokestatic 78	com/tencent/mm/sdk/e/c:w	(Ljava/lang/Class;)Lcom/tencent/mm/sdk/e/c$a;
    //   34: getfield 84	com/tencent/mm/sdk/e/c$a:gZM	[Ljava/lang/reflect/Field;
    //   37: astore 4
    //   39: aload 4
    //   41: arraylength
    //   42: istore_3
    //   43: iconst_0
    //   44: istore_2
    //   45: iload_2
    //   46: iload_3
    //   47: if_icmpge +119 -> 166
    //   50: aload 4
    //   52: iload_2
    //   53: aaload
    //   54: astore 5
    //   56: getstatic 88	com/tencent/mm/cache/MCacheItem$a:fMp	Ljava/util/Map;
    //   59: aload 5
    //   61: invokevirtual 94	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   64: invokeinterface 100 2 0
    //   69: checkcast 102	java/lang/reflect/Method
    //   72: astore 6
    //   74: aload 6
    //   76: ifnull +30 -> 106
    //   79: aload 6
    //   81: aconst_null
    //   82: iconst_3
    //   83: anewarray 4	java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload_1
    //   89: aastore
    //   90: dup
    //   91: iconst_1
    //   92: aload 5
    //   94: aastore
    //   95: dup
    //   96: iconst_2
    //   97: aload_0
    //   98: getfield 47	com/tencent/mm/cache/MCacheItem:fMn	Lcom/tencent/mm/sdk/e/c;
    //   101: aastore
    //   102: invokevirtual 106	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   105: pop
    //   106: iload_2
    //   107: iconst_1
    //   108: iadd
    //   109: istore_2
    //   110: goto -65 -> 45
    //   113: astore 5
    //   115: ldc 108
    //   117: ldc 110
    //   119: iconst_1
    //   120: anewarray 4	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: aload 5
    //   127: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   130: aastore
    //   131: invokestatic 122	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   134: goto -28 -> 106
    //   137: astore_1
    //   138: ldc 108
    //   140: ldc 110
    //   142: iconst_1
    //   143: anewarray 4	java/lang/Object
    //   146: dup
    //   147: iconst_0
    //   148: aload_1
    //   149: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   152: aastore
    //   153: invokestatic 122	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: ldc2_w 54
    //   159: ldc 56
    //   161: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   164: aconst_null
    //   165: areturn
    //   166: aload_0
    //   167: getfield 47	com/tencent/mm/cache/MCacheItem:fMn	Lcom/tencent/mm/sdk/e/c;
    //   170: astore_1
    //   171: ldc2_w 54
    //   174: ldc 56
    //   176: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   179: aload_1
    //   180: areturn
    //   181: astore 5
    //   183: goto -154 -> 29
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	this	MCacheItem
    //   0	186	1	paramParcel	Parcel
    //   44	66	2	i	int
    //   42	6	3	j	int
    //   15	36	4	localObject1	Object
    //   54	39	5	localObject2	Object
    //   113	13	5	localException1	Exception
    //   181	1	5	localException2	Exception
    //   72	8	6	localMethod	Method
    // Exception table:
    //   from	to	target	type
    //   79	106	113	java/lang/Exception
    //   8	17	137	java/lang/Exception
    //   29	43	137	java/lang/Exception
    //   56	74	137	java/lang/Exception
    //   115	134	137	java/lang/Exception
    //   166	171	137	java/lang/Exception
    //   17	29	181	java/lang/Exception
  }
  
  public int describeContents()
  {
    GMTrace.i(13640681914368L, 101631);
    GMTrace.o(13640681914368L, 101631);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(13640816132096L, 101632);
    paramParcel.writeString(this.fMn.getClass().getName());
    Field[] arrayOfField = c.w(this.fMn.getClass()).gZM;
    int i = arrayOfField.length;
    paramInt = 0;
    for (;;)
    {
      if (paramInt < i)
      {
        Field localField = arrayOfField[paramInt];
        Method localMethod = (Method)a.fMo.get(localField.getType());
        if (localMethod != null) {}
        try
        {
          localMethod.invoke(null, new Object[] { paramParcel, localField, this.fMn });
          paramInt += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(localException) });
          }
        }
      }
    }
    GMTrace.o(13640816132096L, 101632);
  }
  
  static class a
  {
    public static Map<Class<?>, Method> fMo;
    public static Map<Class<?>, Method> fMp;
    
    static
    {
      GMTrace.i(13640145043456L, 101627);
      fMo = new HashMap();
      fMp = new HashMap();
      try
      {
        fMo.put(byte[].class, a.class.getMethod("keep_writeByteArray", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Short.TYPE, a.class.getMethod("keep_writeShort", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Short.class, a.class.getMethod("keep_writeShort", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Boolean.TYPE, a.class.getMethod("keep_writeBoolean", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Boolean.class, a.class.getMethod("keep_writeBoolean", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Integer.TYPE, a.class.getMethod("keep_writeInt", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Integer.class, a.class.getMethod("keep_writeInt", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Float.TYPE, a.class.getMethod("keep_writeFloat", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Float.class, a.class.getMethod("keep_writeFloat", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Double.TYPE, a.class.getMethod("keep_writeDouble", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Double.class, a.class.getMethod("keep_writeDouble", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Long.TYPE, a.class.getMethod("keep_writeLong", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(Long.class, a.class.getMethod("keep_writeLong", new Class[] { Parcel.class, Field.class, Object.class }));
        fMo.put(String.class, a.class.getMethod("keep_writeString", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(byte[].class, a.class.getMethod("keep_readByteArray", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Short.TYPE, a.class.getMethod("keep_readShort", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Short.class, a.class.getMethod("keep_readShort", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Boolean.TYPE, a.class.getMethod("keep_readBoolean", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Boolean.class, a.class.getMethod("keep_readBoolean", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Integer.TYPE, a.class.getMethod("keep_readInt", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Integer.class, a.class.getMethod("keep_readInt", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Float.TYPE, a.class.getMethod("keep_readFloat", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Float.class, a.class.getMethod("keep_readFloat", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Double.TYPE, a.class.getMethod("keep_readDouble", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Double.class, a.class.getMethod("keep_readDouble", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Long.TYPE, a.class.getMethod("keep_readLong", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(Long.class, a.class.getMethod("keep_readLong", new Class[] { Parcel.class, Field.class, Object.class }));
        fMp.put(String.class, a.class.getMethod("keep_readString", new Class[] { Parcel.class, Field.class, Object.class }));
        GMTrace.o(13640145043456L, 101627);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(localException) });
        GMTrace.o(13640145043456L, 101627);
      }
    }
    
    a()
    {
      GMTrace.i(13637863342080L, 101610);
      GMTrace.o(13637863342080L, 101610);
    }
    
    public static void keep_readBoolean(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13639339737088L, 101621);
      try
      {
        if (paramParcel.readInt() != 0) {}
        for (boolean bool = true;; bool = false)
        {
          paramField.setBoolean(paramObject, bool);
          GMTrace.o(13639339737088L, 101621);
          return;
        }
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13639339737088L, 101621);
      }
    }
    
    public static void keep_readByteArray(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13639071301632L, 101619);
      try
      {
        paramField.set(paramObject, paramParcel.createByteArray());
        GMTrace.o(13639071301632L, 101619);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13639071301632L, 101619);
      }
    }
    
    public static void keep_readDouble(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13639742390272L, 101624);
      try
      {
        paramField.setDouble(paramObject, paramParcel.readDouble());
        GMTrace.o(13639742390272L, 101624);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13639742390272L, 101624);
      }
    }
    
    public static void keep_readFloat(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13639608172544L, 101623);
      try
      {
        paramField.setFloat(paramObject, paramParcel.readFloat());
        GMTrace.o(13639608172544L, 101623);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13639608172544L, 101623);
      }
    }
    
    public static void keep_readInt(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13639473954816L, 101622);
      try
      {
        paramField.setInt(paramObject, paramParcel.readInt());
        GMTrace.o(13639473954816L, 101622);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13639473954816L, 101622);
      }
    }
    
    public static void keep_readLong(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13639876608000L, 101625);
      try
      {
        paramField.set(paramObject, Long.valueOf(paramParcel.readLong()));
        GMTrace.o(13639876608000L, 101625);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13639876608000L, 101625);
      }
    }
    
    public static void keep_readShort(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13639205519360L, 101620);
      try
      {
        paramField.setShort(paramObject, (short)paramParcel.readInt());
        GMTrace.o(13639205519360L, 101620);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13639205519360L, 101620);
      }
    }
    
    public static void keep_readString(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13640010825728L, 101626);
      try
      {
        paramField.set(paramObject, paramParcel.readString());
        GMTrace.o(13640010825728L, 101626);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13640010825728L, 101626);
      }
    }
    
    public static void keep_writeBoolean(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13638265995264L, 101613);
      try
      {
        if (paramField.getBoolean(paramObject)) {}
        for (int i = 1;; i = 0)
        {
          paramParcel.writeInt(i);
          GMTrace.o(13638265995264L, 101613);
          return;
        }
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13638265995264L, 101613);
      }
    }
    
    public static void keep_writeByteArray(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13637997559808L, 101611);
      try
      {
        paramParcel.writeByteArray((byte[])paramField.get(paramObject));
        GMTrace.o(13637997559808L, 101611);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13637997559808L, 101611);
      }
    }
    
    public static void keep_writeDouble(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13638668648448L, 101616);
      try
      {
        paramParcel.writeDouble(paramField.getDouble(paramObject));
        GMTrace.o(13638668648448L, 101616);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13638668648448L, 101616);
      }
    }
    
    public static void keep_writeFloat(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13638534430720L, 101615);
      try
      {
        paramParcel.writeFloat(paramField.getFloat(paramObject));
        GMTrace.o(13638534430720L, 101615);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13638534430720L, 101615);
      }
    }
    
    public static void keep_writeInt(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13638400212992L, 101614);
      try
      {
        paramParcel.writeInt(paramField.getInt(paramObject));
        GMTrace.o(13638400212992L, 101614);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13638400212992L, 101614);
      }
    }
    
    public static void keep_writeLong(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13638802866176L, 101617);
      try
      {
        paramParcel.writeLong(paramField.getLong(paramObject));
        GMTrace.o(13638802866176L, 101617);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13638802866176L, 101617);
      }
    }
    
    public static void keep_writeShort(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13638131777536L, 101612);
      try
      {
        paramParcel.writeInt(paramField.getShort(paramObject));
        GMTrace.o(13638131777536L, 101612);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13638131777536L, 101612);
      }
    }
    
    public static void keep_writeString(Parcel paramParcel, Field paramField, Object paramObject)
    {
      GMTrace.i(13638937083904L, 101618);
      try
      {
        paramParcel.writeString((String)paramField.get(paramObject));
        GMTrace.o(13638937083904L, 101618);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bg.f(paramParcel) });
        GMTrace.o(13638937083904L, 101618);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\cache\MCacheItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */