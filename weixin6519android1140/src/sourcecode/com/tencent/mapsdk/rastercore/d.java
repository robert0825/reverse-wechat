package com.tencent.mapsdk.rastercore;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mapsdk.rastercore.c.e;
import com.tencent.mapsdk.rastercore.tile.MapTile.MapSource;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  private String a;
  private c b;
  private String c;
  
  public d(Context paramContext, b paramb)
  {
    String str = com.tencent.mapsdk.rastercore.f.a.a(paramContext);
    this.c = paramContext.getPackageName();
    paramContext = new StringBuilder(256);
    paramContext.append("https://confinfo.map.qq.com/confinfo?apikey=");
    paramContext.append(str);
    paramContext.append("&type=2");
    paramContext.append("&pf=Android_2D");
    paramContext.append("&uk=");
    paramContext.append(a.a());
    this.a = paramContext.toString();
    this.b = new c(paramb);
  }
  
  public static boolean a(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }
  
  public static String[] c(String paramString)
  {
    String[] arrayOfString = new String[2];
    try
    {
      paramString = new JSONObject(paramString);
      arrayOfString[0] = paramString.optString("version");
      arrayOfString[1] = paramString.optString("data");
      return arrayOfString;
    }
    catch (JSONException paramString) {}
    return arrayOfString;
  }
  
  public final void a()
  {
    this.b.execute(new String[] { this.a, this.c });
  }
  
  public class a
  {
    public static double a(LatLng paramLatLng1, LatLng paramLatLng2)
    {
      double d4 = paramLatLng1.getLongitude();
      double d3 = paramLatLng1.getLatitude();
      double d2 = paramLatLng2.getLongitude();
      double d1 = paramLatLng2.getLatitude();
      double d5 = d4 * 0.01745329251994329D;
      double d6 = d3 * 0.01745329251994329D;
      d3 = d2 * 0.01745329251994329D;
      d4 = d1 * 0.01745329251994329D;
      d1 = Math.sin(d5);
      d2 = Math.sin(d6);
      d5 = Math.cos(d5);
      d6 = Math.cos(d6);
      double d7 = Math.sin(d3);
      double d8 = Math.sin(d4);
      d3 = Math.cos(d3);
      d4 = Math.cos(d4);
      paramLatLng1 = new double[3];
      paramLatLng2 = new double[3];
      paramLatLng1[0] = (d5 * d6);
      paramLatLng1[1] = (d6 * d1);
      paramLatLng1[2] = d2;
      paramLatLng2[0] = (d4 * d3);
      paramLatLng2[1] = (d4 * d7);
      paramLatLng2[2] = d8;
      return Math.asin(Math.sqrt((paramLatLng1[0] - paramLatLng2[0]) * (paramLatLng1[0] - paramLatLng2[0]) + (paramLatLng1[1] - paramLatLng2[1]) * (paramLatLng1[1] - paramLatLng2[1]) + (paramLatLng1[2] - paramLatLng2[2]) * (paramLatLng1[2] - paramLatLng2[2])) / 2.0D) * 1.27420015798544E7D;
    }
    
    public static LatLng a(com.tencent.mapsdk.rastercore.b.c paramc)
    {
      float f = (float)(paramc.b() * 180.0D / 2.003750834E7D);
      return new LatLng((float)(57.29577951308232D * (2.0D * Math.atan(Math.exp((float)(paramc.a() * 180.0D / 2.003750834E7D) * 3.141592653589793D / 180.0D)) - 1.5707963267948966D)), f);
    }
    
    public static com.tencent.mapsdk.rastercore.b.c a(PointF paramPointF1, com.tencent.mapsdk.rastercore.b.c paramc, PointF paramPointF2, com.tencent.mapsdk.rastercore.b.a parama)
    {
      float f1 = paramPointF1.x;
      float f2 = paramPointF2.x;
      float f3 = paramPointF1.y;
      float f4 = paramPointF2.y;
      return new com.tencent.mapsdk.rastercore.b.c(paramc.b() + (f1 - f2) * parama.d(), paramc.a() - (f3 - f4) * parama.d());
    }
    
    public static com.tencent.mapsdk.rastercore.b.c a(LatLng paramLatLng)
    {
      if (paramLatLng == null) {
        return null;
      }
      double d = paramLatLng.getLatitude();
      return new com.tencent.mapsdk.rastercore.b.c(paramLatLng.getLongitude() * 2.003750834E7D / 180.0D, Math.log(Math.tan((d + 90.0D) * 3.141592653589793D / 360.0D)) / 0.017453292519943295D * 2.003750834E7D / 180.0D);
    }
    
    public static com.tencent.mapsdk.rastercore.c.a a(float paramFloat, Point paramPoint)
    {
      e locale = new e();
      locale.a(paramFloat);
      locale.a(paramPoint);
      return locale;
    }
    
    public static com.tencent.mapsdk.rastercore.c.a a(CameraPosition paramCameraPosition)
    {
      com.tencent.mapsdk.rastercore.c.c localc = new com.tencent.mapsdk.rastercore.c.c();
      localc.a(paramCameraPosition);
      return localc;
    }
    
    public static com.tencent.mapsdk.rastercore.c.a a(LatLngBounds paramLatLngBounds, int paramInt1, int paramInt2, int paramInt3)
    {
      com.tencent.mapsdk.rastercore.c.b localb = new com.tencent.mapsdk.rastercore.c.b();
      localb.a(paramLatLngBounds);
      localb.c(paramInt3);
      localb.a(paramInt1);
      localb.b(paramInt2);
      return localb;
    }
    
    public static a a()
    {
      return a.a;
    }
    
    public static void a(Closeable paramCloseable)
    {
      if (paramCloseable != null) {}
      try
      {
        paramCloseable.close();
        return;
      }
      catch (IOException paramCloseable) {}
    }
    
    /* Error */
    public static boolean a(byte[] paramArrayOfByte, String paramString)
    {
      // Byte code:
      //   0: new 148	java/io/FileOutputStream
      //   3: dup
      //   4: aload_1
      //   5: invokespecial 151	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
      //   8: astore_2
      //   9: aload_2
      //   10: astore_1
      //   11: aload_2
      //   12: aload_0
      //   13: invokevirtual 155	java/io/FileOutputStream:write	([B)V
      //   16: aload_2
      //   17: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   20: iconst_1
      //   21: ireturn
      //   22: astore_3
      //   23: aconst_null
      //   24: astore_0
      //   25: aload_0
      //   26: astore_1
      //   27: new 159	java/lang/StringBuilder
      //   30: dup
      //   31: ldc -95
      //   33: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   36: aload_3
      //   37: invokevirtual 166	java/io/IOException:toString	()Ljava/lang/String;
      //   40: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   43: pop
      //   44: aload_0
      //   45: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   48: iconst_0
      //   49: ireturn
      //   50: astore_0
      //   51: aconst_null
      //   52: astore_1
      //   53: aload_1
      //   54: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   57: aload_0
      //   58: athrow
      //   59: astore_0
      //   60: goto -7 -> 53
      //   63: astore_3
      //   64: aload_2
      //   65: astore_0
      //   66: goto -41 -> 25
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	69	0	paramArrayOfByte	byte[]
      //   0	69	1	paramString	String
      //   8	57	2	localFileOutputStream	java.io.FileOutputStream
      //   22	15	3	localIOException1	IOException
      //   63	1	3	localIOException2	IOException
      // Exception table:
      //   from	to	target	type
      //   0	9	22	java/io/IOException
      //   0	9	50	finally
      //   11	16	59	finally
      //   27	44	59	finally
      //   11	16	63	java/io/IOException
    }
    
    /* Error */
    public static byte[] a(java.io.InputStream paramInputStream)
    {
      // Byte code:
      //   0: new 173	java/io/ByteArrayOutputStream
      //   3: dup
      //   4: invokespecial 174	java/io/ByteArrayOutputStream:<init>	()V
      //   7: astore_3
      //   8: aload_3
      //   9: astore_2
      //   10: sipush 4096
      //   13: newarray <illegal type>
      //   15: astore 4
      //   17: aload_3
      //   18: astore_2
      //   19: aload_0
      //   20: aload 4
      //   22: iconst_0
      //   23: sipush 4096
      //   26: invokevirtual 180	java/io/InputStream:read	([BII)I
      //   29: istore_1
      //   30: iload_1
      //   31: iconst_m1
      //   32: if_icmpeq +46 -> 78
      //   35: aload_3
      //   36: astore_2
      //   37: aload_3
      //   38: aload 4
      //   40: iconst_0
      //   41: iload_1
      //   42: invokevirtual 183	java/io/ByteArrayOutputStream:write	([BII)V
      //   45: goto -28 -> 17
      //   48: astore_2
      //   49: aload_3
      //   50: astore_0
      //   51: aload_2
      //   52: astore_3
      //   53: aload_0
      //   54: astore_2
      //   55: new 159	java/lang/StringBuilder
      //   58: dup
      //   59: ldc -71
      //   61: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   64: aload_3
      //   65: invokevirtual 166	java/io/IOException:toString	()Ljava/lang/String;
      //   68: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   71: pop
      //   72: aload_0
      //   73: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   76: aconst_null
      //   77: areturn
      //   78: aload_3
      //   79: astore_2
      //   80: aload_3
      //   81: invokevirtual 188	java/io/ByteArrayOutputStream:flush	()V
      //   84: aload_3
      //   85: astore_2
      //   86: aload_3
      //   87: invokevirtual 192	java/io/ByteArrayOutputStream:toByteArray	()[B
      //   90: astore_0
      //   91: aload_3
      //   92: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   95: aload_0
      //   96: areturn
      //   97: astore_0
      //   98: aconst_null
      //   99: astore_2
      //   100: aload_2
      //   101: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   104: aload_0
      //   105: athrow
      //   106: astore_0
      //   107: goto -7 -> 100
      //   110: astore_3
      //   111: aconst_null
      //   112: astore_0
      //   113: goto -60 -> 53
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	116	0	paramInputStream	java.io.InputStream
      //   29	13	1	i	int
      //   9	28	2	localObject1	Object
      //   48	4	2	localIOException1	IOException
      //   54	47	2	localObject2	Object
      //   7	85	3	localObject3	Object
      //   110	1	3	localIOException2	IOException
      //   15	24	4	arrayOfByte	byte[]
      // Exception table:
      //   from	to	target	type
      //   10	17	48	java/io/IOException
      //   19	30	48	java/io/IOException
      //   37	45	48	java/io/IOException
      //   80	84	48	java/io/IOException
      //   86	91	48	java/io/IOException
      //   0	8	97	finally
      //   10	17	106	finally
      //   19	30	106	finally
      //   37	45	106	finally
      //   55	72	106	finally
      //   80	84	106	finally
      //   86	91	106	finally
      //   0	8	110	java/io/IOException
    }
    
    /* Error */
    public static byte[] a(String paramString)
    {
      // Byte code:
      //   0: new 197	java/io/FileInputStream
      //   3: dup
      //   4: aload_0
      //   5: invokespecial 198	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
      //   8: astore_3
      //   9: new 173	java/io/ByteArrayOutputStream
      //   12: dup
      //   13: invokespecial 174	java/io/ByteArrayOutputStream:<init>	()V
      //   16: astore_2
      //   17: aload_2
      //   18: astore 5
      //   20: aload_3
      //   21: astore 4
      //   23: sipush 1024
      //   26: newarray <illegal type>
      //   28: astore 6
      //   30: aload_2
      //   31: astore 5
      //   33: aload_3
      //   34: astore 4
      //   36: aload_3
      //   37: aload 6
      //   39: invokevirtual 201	java/io/FileInputStream:read	([B)I
      //   42: istore_1
      //   43: iload_1
      //   44: ifle +65 -> 109
      //   47: aload_2
      //   48: astore 5
      //   50: aload_3
      //   51: astore 4
      //   53: aload_2
      //   54: aload 6
      //   56: iconst_0
      //   57: iload_1
      //   58: invokevirtual 183	java/io/ByteArrayOutputStream:write	([BII)V
      //   61: goto -31 -> 30
      //   64: astore 6
      //   66: aload_2
      //   67: astore 5
      //   69: aload_3
      //   70: astore 4
      //   72: new 159	java/lang/StringBuilder
      //   75: dup
      //   76: ldc -53
      //   78: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   81: aload_0
      //   82: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   85: ldc -51
      //   87: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   90: aload 6
      //   92: invokevirtual 206	java/lang/Exception:toString	()Ljava/lang/String;
      //   95: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   98: pop
      //   99: aload_3
      //   100: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   103: aload_2
      //   104: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   107: aconst_null
      //   108: areturn
      //   109: aload_2
      //   110: astore 5
      //   112: aload_3
      //   113: astore 4
      //   115: aload_2
      //   116: invokevirtual 192	java/io/ByteArrayOutputStream:toByteArray	()[B
      //   119: astore 6
      //   121: aload_3
      //   122: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   125: aload_2
      //   126: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   129: aload 6
      //   131: areturn
      //   132: astore_0
      //   133: aconst_null
      //   134: astore 5
      //   136: aconst_null
      //   137: astore_3
      //   138: aload_3
      //   139: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   142: aload 5
      //   144: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   147: aload_0
      //   148: athrow
      //   149: astore_0
      //   150: aconst_null
      //   151: astore 5
      //   153: goto -15 -> 138
      //   156: astore_0
      //   157: aload 4
      //   159: astore_3
      //   160: goto -22 -> 138
      //   163: astore 6
      //   165: aconst_null
      //   166: astore_2
      //   167: aconst_null
      //   168: astore_3
      //   169: goto -103 -> 66
      //   172: astore 6
      //   174: aconst_null
      //   175: astore_2
      //   176: goto -110 -> 66
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	179	0	paramString	String
      //   42	16	1	i	int
      //   16	160	2	localByteArrayOutputStream1	java.io.ByteArrayOutputStream
      //   8	161	3	localObject1	Object
      //   21	137	4	localObject2	Object
      //   18	134	5	localByteArrayOutputStream2	java.io.ByteArrayOutputStream
      //   28	27	6	arrayOfByte1	byte[]
      //   64	27	6	localException1	Exception
      //   119	11	6	arrayOfByte2	byte[]
      //   163	1	6	localException2	Exception
      //   172	1	6	localException3	Exception
      // Exception table:
      //   from	to	target	type
      //   23	30	64	java/lang/Exception
      //   36	43	64	java/lang/Exception
      //   53	61	64	java/lang/Exception
      //   115	121	64	java/lang/Exception
      //   0	9	132	finally
      //   9	17	149	finally
      //   23	30	156	finally
      //   36	43	156	finally
      //   53	61	156	finally
      //   72	99	156	finally
      //   115	121	156	finally
      //   0	9	163	java/lang/Exception
      //   9	17	172	java/lang/Exception
    }
    
    public static String b()
    {
      StringBuilder localStringBuilder = new StringBuilder(com.tencent.mapsdk.rastercore.tile.a.a.a().b());
      b(localStringBuilder.toString());
      localStringBuilder.append("bingLogo.dat");
      return localStringBuilder.toString();
    }
    
    public static boolean b(String paramString)
    {
      if (TextUtils.isEmpty(paramString)) {
        return false;
      }
      try
      {
        paramString = new File(paramString);
        if ((paramString.exists()) && (paramString.isDirectory())) {
          return true;
        }
        if ((paramString.exists()) && (paramString.isFile())) {
          paramString.delete();
        }
        boolean bool = paramString.mkdirs();
        return bool;
      }
      catch (Exception paramString) {}
      return false;
    }
    
    public static String c()
    {
      b(com.tencent.mapsdk.rastercore.tile.a.a.a().b());
      return com.tencent.mapsdk.rastercore.tile.a.a.a().b() + "/frontier.dat";
    }
    
    private static String d()
    {
      String str = com.tencent.mapsdk.rastercore.tile.a.a.a().b();
      b(str);
      return str + "cache.info";
    }
    
    /* Error */
    public final int a(int paramInt1, int paramInt2)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_3
      //   2: new 227	java/io/File
      //   5: dup
      //   6: invokestatic 254	com/tencent/mapsdk/rastercore/d$a:d	()Ljava/lang/String;
      //   9: invokespecial 228	java/io/File:<init>	(Ljava/lang/String;)V
      //   12: astore 4
      //   14: aload 4
      //   16: invokevirtual 232	java/io/File:exists	()Z
      //   19: ifne +9 -> 28
      //   22: aload 4
      //   24: invokevirtual 257	java/io/File:createNewFile	()Z
      //   27: pop
      //   28: new 197	java/io/FileInputStream
      //   31: dup
      //   32: aload 4
      //   34: invokespecial 260	java/io/FileInputStream:<init>	(Ljava/io/File;)V
      //   37: astore 4
      //   39: new 262	java/util/Properties
      //   42: dup
      //   43: invokespecial 263	java/util/Properties:<init>	()V
      //   46: astore_3
      //   47: aload_3
      //   48: aload 4
      //   50: invokevirtual 267	java/util/Properties:load	(Ljava/io/InputStream;)V
      //   53: iload_2
      //   54: tableswitch	default:+30->84, 0:+37->91, 1:+125->179, 2:+77->131, 3:+108->162
      //   84: aload 4
      //   86: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   89: iconst_m1
      //   90: ireturn
      //   91: aload_3
      //   92: new 159	java/lang/StringBuilder
      //   95: dup
      //   96: ldc_w 269
      //   99: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   102: iload_1
      //   103: invokevirtual 272	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   106: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   109: getstatic 277	com/tencent/mapsdk/rastercore/b:a	I
      //   112: invokestatic 283	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   115: invokevirtual 287	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   118: astore_3
      //   119: aload_3
      //   120: invokestatic 293	java/lang/Integer:parseInt	(Ljava/lang/String;)I
      //   123: istore_1
      //   124: aload 4
      //   126: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   129: iload_1
      //   130: ireturn
      //   131: aload_3
      //   132: new 159	java/lang/StringBuilder
      //   135: dup
      //   136: ldc_w 295
      //   139: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   142: iload_1
      //   143: invokevirtual 272	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   146: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   149: getstatic 297	com/tencent/mapsdk/rastercore/b:c	I
      //   152: invokestatic 283	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   155: invokevirtual 287	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   158: astore_3
      //   159: goto -40 -> 119
      //   162: aload_3
      //   163: ldc_w 299
      //   166: getstatic 301	com/tencent/mapsdk/rastercore/b:d	I
      //   169: invokestatic 283	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   172: invokevirtual 287	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   175: astore_3
      //   176: goto -57 -> 119
      //   179: aload_3
      //   180: ldc_w 303
      //   183: getstatic 305	com/tencent/mapsdk/rastercore/b:b	I
      //   186: invokestatic 283	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   189: invokevirtual 287	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   192: astore_3
      //   193: goto -74 -> 119
      //   196: astore 4
      //   198: aload_3
      //   199: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   202: iconst_m1
      //   203: ireturn
      //   204: astore_3
      //   205: aconst_null
      //   206: astore 4
      //   208: aload 4
      //   210: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   213: aload_3
      //   214: athrow
      //   215: astore_3
      //   216: goto -8 -> 208
      //   219: astore_3
      //   220: aload 4
      //   222: astore_3
      //   223: goto -25 -> 198
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	226	0	this	a
      //   0	226	1	paramInt1	int
      //   0	226	2	paramInt2	int
      //   1	198	3	localObject1	Object
      //   204	10	3	localObject2	Object
      //   215	1	3	localObject3	Object
      //   219	1	3	localThrowable1	Throwable
      //   222	1	3	localObject4	Object
      //   12	113	4	localObject5	Object
      //   196	1	4	localThrowable2	Throwable
      //   206	15	4	localCloseable	Closeable
      // Exception table:
      //   from	to	target	type
      //   2	28	196	java/lang/Throwable
      //   28	39	196	java/lang/Throwable
      //   2	28	204	finally
      //   28	39	204	finally
      //   39	53	215	finally
      //   91	119	215	finally
      //   119	124	215	finally
      //   131	159	215	finally
      //   162	176	215	finally
      //   179	193	215	finally
      //   39	53	219	java/lang/Throwable
      //   91	119	219	java/lang/Throwable
      //   119	124	219	java/lang/Throwable
      //   131	159	219	java/lang/Throwable
      //   162	176	219	java/lang/Throwable
      //   179	193	219	java/lang/Throwable
    }
    
    /* Error */
    public final int a(String paramString, boolean paramBoolean)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 4
      //   3: aconst_null
      //   4: astore 6
      //   6: invokestatic 254	com/tencent/mapsdk/rastercore/d$a:d	()Ljava/lang/String;
      //   9: astore 7
      //   11: aload 4
      //   13: astore 5
      //   15: new 227	java/io/File
      //   18: dup
      //   19: aload 7
      //   21: invokespecial 228	java/io/File:<init>	(Ljava/lang/String;)V
      //   24: astore 8
      //   26: aload 4
      //   28: astore 5
      //   30: aload 8
      //   32: invokevirtual 232	java/io/File:exists	()Z
      //   35: ifeq +132 -> 167
      //   38: aload 4
      //   40: astore 5
      //   42: aload 8
      //   44: invokevirtual 238	java/io/File:isFile	()Z
      //   47: ifeq +120 -> 167
      //   50: aload 4
      //   52: astore 5
      //   54: new 197	java/io/FileInputStream
      //   57: dup
      //   58: aload 8
      //   60: invokespecial 260	java/io/FileInputStream:<init>	(Ljava/io/File;)V
      //   63: astore 4
      //   65: new 262	java/util/Properties
      //   68: dup
      //   69: invokespecial 263	java/util/Properties:<init>	()V
      //   72: astore 6
      //   74: aload 6
      //   76: aload 4
      //   78: invokevirtual 267	java/util/Properties:load	(Ljava/io/InputStream;)V
      //   81: new 159	java/lang/StringBuilder
      //   84: dup
      //   85: invokespecial 245	java/lang/StringBuilder:<init>	()V
      //   88: aload_1
      //   89: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   92: ldc_w 308
      //   95: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   98: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   101: astore 5
      //   103: aload 5
      //   105: astore_1
      //   106: iload_2
      //   107: ifeq +25 -> 132
      //   110: new 159	java/lang/StringBuilder
      //   113: dup
      //   114: invokespecial 245	java/lang/StringBuilder:<init>	()V
      //   117: aload 5
      //   119: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   122: ldc_w 310
      //   125: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   128: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   131: astore_1
      //   132: aload 6
      //   134: aload_1
      //   135: ldc_w 312
      //   138: invokevirtual 287	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   141: astore 5
      //   143: aload 4
      //   145: astore_1
      //   146: aload 5
      //   148: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
      //   151: ifne +18 -> 169
      //   154: aload 5
      //   156: invokestatic 293	java/lang/Integer:parseInt	(Ljava/lang/String;)I
      //   159: istore_3
      //   160: aload 4
      //   162: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   165: iload_3
      //   166: ireturn
      //   167: aconst_null
      //   168: astore_1
      //   169: aload_1
      //   170: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   173: sipush 1000
      //   176: ireturn
      //   177: astore 4
      //   179: aload 6
      //   181: astore_1
      //   182: aload_1
      //   183: astore 5
      //   185: new 159	java/lang/StringBuilder
      //   188: dup
      //   189: ldc_w 314
      //   192: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   195: aload 7
      //   197: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   200: ldc_w 316
      //   203: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   206: aload 4
      //   208: invokevirtual 319	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   211: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   214: pop
      //   215: aload_1
      //   216: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   219: goto -46 -> 173
      //   222: astore_1
      //   223: aload 5
      //   225: astore 4
      //   227: aload 4
      //   229: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   232: aload_1
      //   233: athrow
      //   234: astore_1
      //   235: goto -8 -> 227
      //   238: astore 5
      //   240: aload 4
      //   242: astore_1
      //   243: aload 5
      //   245: astore 4
      //   247: goto -65 -> 182
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	250	0	this	a
      //   0	250	1	paramString	String
      //   0	250	2	paramBoolean	boolean
      //   159	7	3	i	int
      //   1	160	4	localFileInputStream	java.io.FileInputStream
      //   177	30	4	localException1	Exception
      //   225	21	4	localObject1	Object
      //   13	211	5	localObject2	Object
      //   238	6	5	localException2	Exception
      //   4	176	6	localProperties	java.util.Properties
      //   9	187	7	str	String
      //   24	35	8	localFile	File
      // Exception table:
      //   from	to	target	type
      //   15	26	177	java/lang/Exception
      //   30	38	177	java/lang/Exception
      //   42	50	177	java/lang/Exception
      //   54	65	177	java/lang/Exception
      //   15	26	222	finally
      //   30	38	222	finally
      //   42	50	222	finally
      //   54	65	222	finally
      //   185	215	222	finally
      //   65	103	234	finally
      //   110	132	234	finally
      //   132	143	234	finally
      //   146	160	234	finally
      //   65	103	238	java/lang/Exception
      //   110	132	238	java/lang/Exception
      //   132	143	238	java/lang/Exception
      //   146	160	238	java/lang/Exception
    }
    
    /* Error */
    public final boolean a(int paramInt1, int paramInt2, int paramInt3)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 5
      //   3: new 262	java/util/Properties
      //   6: dup
      //   7: invokespecial 263	java/util/Properties:<init>	()V
      //   10: astore 7
      //   12: new 227	java/io/File
      //   15: dup
      //   16: invokestatic 254	com/tencent/mapsdk/rastercore/d$a:d	()Ljava/lang/String;
      //   19: invokespecial 228	java/io/File:<init>	(Ljava/lang/String;)V
      //   22: astore 6
      //   24: aload 6
      //   26: invokevirtual 232	java/io/File:exists	()Z
      //   29: ifeq +254 -> 283
      //   32: new 197	java/io/FileInputStream
      //   35: dup
      //   36: aload 6
      //   38: invokespecial 260	java/io/FileInputStream:<init>	(Ljava/io/File;)V
      //   41: astore 4
      //   43: aload 7
      //   45: aload 4
      //   47: invokevirtual 267	java/util/Properties:load	(Ljava/io/InputStream;)V
      //   50: iload_2
      //   51: tableswitch	default:+29->80, 0:+62->113, 1:+170->221, 2:+106->157, 3:+154->205
      //   80: new 148	java/io/FileOutputStream
      //   83: dup
      //   84: aload 6
      //   86: invokespecial 321	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
      //   89: astore 6
      //   91: aload 7
      //   93: aload 6
      //   95: ldc_w 323
      //   98: invokevirtual 327	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
      //   101: aload 4
      //   103: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   106: aload 6
      //   108: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   111: iconst_1
      //   112: ireturn
      //   113: aload 7
      //   115: new 159	java/lang/StringBuilder
      //   118: dup
      //   119: ldc_w 269
      //   122: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   125: iload_1
      //   126: invokevirtual 272	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   129: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   132: iload_3
      //   133: invokestatic 283	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   136: invokevirtual 331	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   139: pop
      //   140: goto -60 -> 80
      //   143: astore 6
      //   145: aload 4
      //   147: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   150: aload 5
      //   152: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   155: iconst_0
      //   156: ireturn
      //   157: aload 7
      //   159: new 159	java/lang/StringBuilder
      //   162: dup
      //   163: ldc_w 295
      //   166: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   169: iload_1
      //   170: invokevirtual 272	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   173: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   176: iload_3
      //   177: invokestatic 283	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   180: invokevirtual 331	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   183: pop
      //   184: goto -104 -> 80
      //   187: astore 5
      //   189: aconst_null
      //   190: astore 6
      //   192: aload 4
      //   194: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   197: aload 6
      //   199: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   202: aload 5
      //   204: athrow
      //   205: aload 7
      //   207: ldc_w 299
      //   210: iload_3
      //   211: invokestatic 283	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   214: invokevirtual 331	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   217: pop
      //   218: goto -138 -> 80
      //   221: aload 7
      //   223: ldc_w 303
      //   226: iload_3
      //   227: invokestatic 283	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   230: invokevirtual 331	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   233: pop
      //   234: goto -154 -> 80
      //   237: astore 5
      //   239: aconst_null
      //   240: astore 4
      //   242: aconst_null
      //   243: astore 6
      //   245: goto -53 -> 192
      //   248: astore 5
      //   250: aconst_null
      //   251: astore 6
      //   253: goto -61 -> 192
      //   256: astore 5
      //   258: goto -66 -> 192
      //   261: astore 4
      //   263: aconst_null
      //   264: astore 4
      //   266: goto -121 -> 145
      //   269: astore 6
      //   271: goto -126 -> 145
      //   274: astore 5
      //   276: aload 6
      //   278: astore 5
      //   280: goto -135 -> 145
      //   283: aconst_null
      //   284: astore 4
      //   286: goto -236 -> 50
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	289	0	this	a
      //   0	289	1	paramInt1	int
      //   0	289	2	paramInt2	int
      //   0	289	3	paramInt3	int
      //   41	200	4	localFileInputStream	java.io.FileInputStream
      //   261	1	4	localThrowable1	Throwable
      //   264	21	4	localObject1	Object
      //   1	150	5	localCloseable1	Closeable
      //   187	16	5	localObject2	Object
      //   237	1	5	localObject3	Object
      //   248	1	5	localObject4	Object
      //   256	1	5	localObject5	Object
      //   274	1	5	localThrowable2	Throwable
      //   278	1	5	localObject6	Object
      //   22	85	6	localObject7	Object
      //   143	1	6	localThrowable3	Throwable
      //   190	62	6	localCloseable2	Closeable
      //   269	8	6	localThrowable4	Throwable
      //   10	212	7	localProperties	java.util.Properties
      // Exception table:
      //   from	to	target	type
      //   80	91	143	java/lang/Throwable
      //   113	140	143	java/lang/Throwable
      //   157	184	143	java/lang/Throwable
      //   205	218	143	java/lang/Throwable
      //   221	234	143	java/lang/Throwable
      //   80	91	187	finally
      //   113	140	187	finally
      //   157	184	187	finally
      //   205	218	187	finally
      //   221	234	187	finally
      //   3	43	237	finally
      //   43	50	248	finally
      //   91	101	256	finally
      //   3	43	261	java/lang/Throwable
      //   43	50	269	java/lang/Throwable
      //   91	101	274	java/lang/Throwable
    }
    
    /* Error */
    public final boolean a(String paramString, int paramInt, boolean paramBoolean)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 9
      //   3: aconst_null
      //   4: astore 4
      //   6: aconst_null
      //   7: astore 8
      //   9: invokestatic 254	com/tencent/mapsdk/rastercore/d$a:d	()Ljava/lang/String;
      //   12: astore 10
      //   14: new 262	java/util/Properties
      //   17: dup
      //   18: invokespecial 263	java/util/Properties:<init>	()V
      //   21: astore 11
      //   23: new 227	java/io/File
      //   26: dup
      //   27: aload 10
      //   29: invokespecial 228	java/io/File:<init>	(Ljava/lang/String;)V
      //   32: astore 5
      //   34: aload 5
      //   36: invokevirtual 232	java/io/File:exists	()Z
      //   39: ifeq +285 -> 324
      //   42: aload 5
      //   44: invokevirtual 238	java/io/File:isFile	()Z
      //   47: ifeq +277 -> 324
      //   50: new 197	java/io/FileInputStream
      //   53: dup
      //   54: aload 10
      //   56: invokespecial 198	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
      //   59: astore 7
      //   61: aload 4
      //   63: astore 5
      //   65: aload 7
      //   67: astore 6
      //   69: aload 11
      //   71: aload 7
      //   73: invokevirtual 267	java/util/Properties:load	(Ljava/io/InputStream;)V
      //   76: aload 4
      //   78: astore 5
      //   80: aload 7
      //   82: astore 6
      //   84: aload 7
      //   86: invokevirtual 333	java/io/FileInputStream:close	()V
      //   89: aload 7
      //   91: astore 4
      //   93: new 159	java/lang/StringBuilder
      //   96: dup
      //   97: invokespecial 245	java/lang/StringBuilder:<init>	()V
      //   100: aload_1
      //   101: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   104: ldc_w 308
      //   107: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   110: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   113: astore 5
      //   115: aload 5
      //   117: astore_1
      //   118: iload_3
      //   119: ifeq +25 -> 144
      //   122: new 159	java/lang/StringBuilder
      //   125: dup
      //   126: invokespecial 245	java/lang/StringBuilder:<init>	()V
      //   129: aload 5
      //   131: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   134: ldc_w 310
      //   137: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   140: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   143: astore_1
      //   144: aload 11
      //   146: aload_1
      //   147: iload_2
      //   148: invokestatic 283	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   151: invokevirtual 331	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   154: pop
      //   155: new 148	java/io/FileOutputStream
      //   158: dup
      //   159: aload 10
      //   161: invokespecial 151	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
      //   164: astore_1
      //   165: aload 11
      //   167: aload_1
      //   168: ldc_w 323
      //   171: invokevirtual 327	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
      //   174: aload 4
      //   176: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   179: aload_1
      //   180: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   183: iconst_0
      //   184: ireturn
      //   185: astore 4
      //   187: aconst_null
      //   188: astore_1
      //   189: aload 8
      //   191: astore 5
      //   193: aload_1
      //   194: astore 6
      //   196: new 159	java/lang/StringBuilder
      //   199: dup
      //   200: ldc_w 314
      //   203: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   206: aload 10
      //   208: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   211: ldc_w 316
      //   214: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   217: aload 4
      //   219: invokevirtual 319	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   222: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   225: pop
      //   226: aload_1
      //   227: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   230: aload 8
      //   232: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   235: goto -52 -> 183
      //   238: astore_1
      //   239: aconst_null
      //   240: astore 4
      //   242: aload 9
      //   244: astore 5
      //   246: aload 4
      //   248: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   251: aload 5
      //   253: invokestatic 157	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
      //   256: aload_1
      //   257: athrow
      //   258: astore_1
      //   259: aload 6
      //   261: astore 4
      //   263: goto -17 -> 246
      //   266: astore_1
      //   267: aload 9
      //   269: astore 5
      //   271: goto -25 -> 246
      //   274: astore 6
      //   276: aload_1
      //   277: astore 5
      //   279: aload 6
      //   281: astore_1
      //   282: goto -36 -> 246
      //   285: astore 4
      //   287: aload 7
      //   289: astore_1
      //   290: goto -101 -> 189
      //   293: astore 5
      //   295: aload 4
      //   297: astore_1
      //   298: aload 5
      //   300: astore 4
      //   302: goto -113 -> 189
      //   305: astore 6
      //   307: aload 4
      //   309: astore 5
      //   311: aload 6
      //   313: astore 4
      //   315: aload_1
      //   316: astore 8
      //   318: aload 5
      //   320: astore_1
      //   321: goto -132 -> 189
      //   324: aconst_null
      //   325: astore 4
      //   327: goto -234 -> 93
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	330	0	this	a
      //   0	330	1	paramString	String
      //   0	330	2	paramInt	int
      //   0	330	3	paramBoolean	boolean
      //   4	171	4	localObject1	Object
      //   185	33	4	localException1	Exception
      //   240	22	4	localObject2	Object
      //   285	11	4	localException2	Exception
      //   300	26	4	localObject3	Object
      //   32	246	5	localObject4	Object
      //   293	6	5	localException3	Exception
      //   309	10	5	localObject5	Object
      //   67	193	6	localObject6	Object
      //   274	6	6	localObject7	Object
      //   305	7	6	localException4	Exception
      //   59	229	7	localFileInputStream	java.io.FileInputStream
      //   7	310	8	localObject8	Object
      //   1	267	9	localObject9	Object
      //   12	195	10	str	String
      //   21	145	11	localProperties	java.util.Properties
      // Exception table:
      //   from	to	target	type
      //   14	61	185	java/lang/Exception
      //   14	61	238	finally
      //   69	76	258	finally
      //   84	89	258	finally
      //   196	226	258	finally
      //   93	115	266	finally
      //   122	144	266	finally
      //   144	165	266	finally
      //   165	174	274	finally
      //   69	76	285	java/lang/Exception
      //   84	89	285	java/lang/Exception
      //   93	115	293	java/lang/Exception
      //   122	144	293	java/lang/Exception
      //   144	165	293	java/lang/Exception
      //   165	174	305	java/lang/Exception
    }
    
    static final class a
    {
      public static final d.a a = new d.a();
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Bitmap paramBitmap);
  }
  
  static final class c
    extends AsyncTask<String, Void, d.d>
  {
    private d.b a;
    
    public c(d.b paramb)
    {
      this.a = paramb;
    }
    
    /* Error */
    private d.d a(String... paramVarArgs)
    {
      // Byte code:
      //   0: iconst_1
      //   1: istore 9
      //   3: new 25	com/tencent/mapsdk/rastercore/d$d
      //   6: dup
      //   7: invokespecial 26	com/tencent/mapsdk/rastercore/d$d:<init>	()V
      //   10: astore 13
      //   12: aload_1
      //   13: ifnull +1134 -> 1147
      //   16: aload_1
      //   17: arraylength
      //   18: iconst_2
      //   19: if_icmpne +1128 -> 1147
      //   22: aload 13
      //   24: getstatic 32	com/tencent/mapsdk/rastercore/b:e	I
      //   27: putfield 34	com/tencent/mapsdk/rastercore/d$d:a	I
      //   30: aload 13
      //   32: invokestatic 40	com/tencent/mapsdk/rastercore/d/e:v	()I
      //   35: putfield 43	com/tencent/mapsdk/rastercore/d$d:b	I
      //   38: aload 13
      //   40: invokestatic 46	com/tencent/mapsdk/rastercore/d/e:t	()I
      //   43: putfield 48	com/tencent/mapsdk/rastercore/d$d:c	I
      //   46: aload 13
      //   48: invokestatic 51	com/tencent/mapsdk/rastercore/d/e:s	()I
      //   51: putfield 54	com/tencent/mapsdk/rastercore/d$d:d	I
      //   54: aload 13
      //   56: invokestatic 57	com/tencent/mapsdk/rastercore/d/e:w	()I
      //   59: putfield 58	com/tencent/mapsdk/rastercore/d$d:e	I
      //   62: aload 13
      //   64: invokestatic 61	com/tencent/mapsdk/rastercore/d/e:x	()I
      //   67: putfield 64	com/tencent/mapsdk/rastercore/d$d:f	I
      //   70: getstatic 69	com/tencent/mapsdk/rastercore/d$a$a:a	Lcom/tencent/mapsdk/rastercore/d$a;
      //   73: astore 10
      //   75: aconst_null
      //   76: astore 10
      //   78: invokestatic 74	com/tencent/mapsdk/rastercore/d$a:c	()Ljava/lang/String;
      //   81: invokestatic 77	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/lang/String;)[B
      //   84: astore 11
      //   86: aload 11
      //   88: ifnull +1053 -> 1141
      //   91: new 79	java/lang/String
      //   94: dup
      //   95: aload 11
      //   97: ldc 81
      //   99: invokespecial 84	java/lang/String:<init>	([BLjava/lang/String;)V
      //   102: astore 11
      //   104: aload 11
      //   106: astore 10
      //   108: aload 10
      //   110: invokestatic 87	com/tencent/mapsdk/rastercore/d:a	(Ljava/lang/String;)Z
      //   113: ifne +1023 -> 1136
      //   116: aload 10
      //   118: invokestatic 90	com/tencent/mapsdk/rastercore/d:c	(Ljava/lang/String;)[Ljava/lang/String;
      //   121: astore 11
      //   123: aload 11
      //   125: iconst_0
      //   126: aaload
      //   127: invokestatic 87	com/tencent/mapsdk/rastercore/d:a	(Ljava/lang/String;)Z
      //   130: ifne +1001 -> 1131
      //   133: aload 11
      //   135: iconst_0
      //   136: aaload
      //   137: invokestatic 96	java/lang/Integer:parseInt	(Ljava/lang/String;)I
      //   140: istore_2
      //   141: iload_2
      //   142: istore_3
      //   143: aload 11
      //   145: iconst_1
      //   146: aaload
      //   147: invokestatic 87	com/tencent/mapsdk/rastercore/d:a	(Ljava/lang/String;)Z
      //   150: ifne +12 -> 162
      //   153: aload 11
      //   155: iconst_1
      //   156: aaload
      //   157: invokestatic 101	com/tencent/mapsdk/rastercore/c:a	(Ljava/lang/String;)V
      //   160: iload_2
      //   161: istore_3
      //   162: new 103	java/net/URL
      //   165: dup
      //   166: new 105	java/lang/StringBuilder
      //   169: dup
      //   170: invokespecial 106	java/lang/StringBuilder:<init>	()V
      //   173: aload_1
      //   174: iconst_0
      //   175: aaload
      //   176: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   179: ldc 112
      //   181: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   184: iload_3
      //   185: invokevirtual 115	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   188: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   191: invokespecial 120	java/net/URL:<init>	(Ljava/lang/String;)V
      //   194: invokevirtual 124	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   197: checkcast 126	java/net/HttpURLConnection
      //   200: astore 11
      //   202: aload 11
      //   204: ldc -128
      //   206: ldc -126
      //   208: invokevirtual 134	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   211: aload 11
      //   213: invokevirtual 137	java/net/HttpURLConnection:getResponseCode	()I
      //   216: sipush 200
      //   219: if_icmpne +928 -> 1147
      //   222: aload 11
      //   224: ldc -117
      //   226: invokevirtual 143	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   229: astore 12
      //   231: aload 12
      //   233: ifnull +103 -> 336
      //   236: aload 12
      //   238: invokevirtual 146	java/lang/String:length	()I
      //   241: ifle +95 -> 336
      //   244: aload 12
      //   246: invokevirtual 149	java/lang/String:toLowerCase	()Ljava/lang/String;
      //   249: ldc -126
      //   251: invokevirtual 153	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   254: ifeq +82 -> 336
      //   257: iconst_1
      //   258: istore_2
      //   259: iload_2
      //   260: ifeq +81 -> 341
      //   263: new 155	java/util/zip/GZIPInputStream
      //   266: dup
      //   267: aload 11
      //   269: invokevirtual 159	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   272: invokespecial 162	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
      //   275: astore 11
      //   277: new 164	org/json/JSONObject
      //   280: dup
      //   281: new 79	java/lang/String
      //   284: dup
      //   285: aload 11
      //   287: invokestatic 167	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/InputStream;)[B
      //   290: invokespecial 170	java/lang/String:<init>	([B)V
      //   293: invokespecial 171	org/json/JSONObject:<init>	(Ljava/lang/String;)V
      //   296: astore 11
      //   298: aload 11
      //   300: ldc -83
      //   302: invokevirtual 176	org/json/JSONObject:optInt	(Ljava/lang/String;)I
      //   305: istore_2
      //   306: iload_2
      //   307: ifeq +44 -> 351
      //   310: aload 13
      //   312: areturn
      //   313: astore 11
      //   315: new 105	java/lang/StringBuilder
      //   318: dup
      //   319: ldc -78
      //   321: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   324: aload 11
      //   326: invokevirtual 180	java/lang/Exception:toString	()Ljava/lang/String;
      //   329: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   332: pop
      //   333: goto -225 -> 108
      //   336: iconst_0
      //   337: istore_2
      //   338: goto -79 -> 259
      //   341: aload 11
      //   343: invokevirtual 159	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   346: astore 11
      //   348: goto -71 -> 277
      //   351: aload 11
      //   353: ldc -74
      //   355: invokevirtual 186	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
      //   358: astore 14
      //   360: aload 14
      //   362: ifnonnull +6 -> 368
      //   365: aload 13
      //   367: areturn
      //   368: aload 14
      //   370: ldc -68
      //   372: invokevirtual 186	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
      //   375: astore 11
      //   377: aload 11
      //   379: ifnonnull +6 -> 385
      //   382: aload 13
      //   384: areturn
      //   385: aload 13
      //   387: aload 11
      //   389: ldc -66
      //   391: sipush 1000
      //   394: invokevirtual 193	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
      //   397: putfield 34	com/tencent/mapsdk/rastercore/d$d:a	I
      //   400: aload 13
      //   402: aload 11
      //   404: ldc -61
      //   406: getstatic 196	com/tencent/mapsdk/rastercore/b:a	I
      //   409: invokevirtual 193	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
      //   412: putfield 43	com/tencent/mapsdk/rastercore/d$d:b	I
      //   415: aload 11
      //   417: ldc -58
      //   419: getstatic 199	com/tencent/mapsdk/rastercore/b:b	I
      //   422: invokevirtual 193	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
      //   425: istore 4
      //   427: aload 11
      //   429: ldc -55
      //   431: getstatic 202	com/tencent/mapsdk/rastercore/b:d	I
      //   434: invokevirtual 193	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
      //   437: istore 5
      //   439: getstatic 69	com/tencent/mapsdk/rastercore/d$a$a:a	Lcom/tencent/mapsdk/rastercore/d$a;
      //   442: aload 13
      //   444: getfield 34	com/tencent/mapsdk/rastercore/d$d:a	I
      //   447: iconst_0
      //   448: aload 13
      //   450: getfield 43	com/tencent/mapsdk/rastercore/d$d:b	I
      //   453: invokevirtual 205	com/tencent/mapsdk/rastercore/d$a:a	(III)Z
      //   456: pop
      //   457: getstatic 69	com/tencent/mapsdk/rastercore/d$a$a:a	Lcom/tencent/mapsdk/rastercore/d$a;
      //   460: aload_1
      //   461: iconst_1
      //   462: aaload
      //   463: aload 13
      //   465: getfield 34	com/tencent/mapsdk/rastercore/d$d:a	I
      //   468: iconst_0
      //   469: invokevirtual 208	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/lang/String;IZ)Z
      //   472: pop
      //   473: getstatic 69	com/tencent/mapsdk/rastercore/d$a$a:a	Lcom/tencent/mapsdk/rastercore/d$a;
      //   476: aload 13
      //   478: getfield 34	com/tencent/mapsdk/rastercore/d$d:a	I
      //   481: iconst_3
      //   482: iload 5
      //   484: invokevirtual 205	com/tencent/mapsdk/rastercore/d$a:a	(III)Z
      //   487: pop
      //   488: getstatic 69	com/tencent/mapsdk/rastercore/d$a$a:a	Lcom/tencent/mapsdk/rastercore/d$a;
      //   491: aload 13
      //   493: getfield 34	com/tencent/mapsdk/rastercore/d$d:a	I
      //   496: iconst_1
      //   497: iload 4
      //   499: invokevirtual 205	com/tencent/mapsdk/rastercore/d$a:a	(III)Z
      //   502: pop
      //   503: aload 14
      //   505: ldc -46
      //   507: invokevirtual 186	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
      //   510: astore 11
      //   512: aload 11
      //   514: ifnonnull +6 -> 520
      //   517: aload 13
      //   519: areturn
      //   520: aload 13
      //   522: aload 11
      //   524: ldc -66
      //   526: sipush 1000
      //   529: invokevirtual 193	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
      //   532: putfield 48	com/tencent/mapsdk/rastercore/d$d:c	I
      //   535: aload 11
      //   537: ldc -61
      //   539: getstatic 211	com/tencent/mapsdk/rastercore/b:c	I
      //   542: invokevirtual 193	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
      //   545: istore 6
      //   547: aload 11
      //   549: ldc -43
      //   551: invokevirtual 216	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
      //   554: astore 11
      //   556: new 218	java/io/File
      //   559: dup
      //   560: invokestatic 220	com/tencent/mapsdk/rastercore/d$a:b	()Ljava/lang/String;
      //   563: invokespecial 221	java/io/File:<init>	(Ljava/lang/String;)V
      //   566: invokevirtual 225	java/io/File:exists	()Z
      //   569: ifne +581 -> 1150
      //   572: iconst_1
      //   573: istore_2
      //   574: iload_2
      //   575: istore_3
      //   576: iload_2
      //   577: ifne +46 -> 623
      //   580: invokestatic 220	com/tencent/mapsdk/rastercore/d$a:b	()Ljava/lang/String;
      //   583: invokestatic 77	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/lang/String;)[B
      //   586: astore 12
      //   588: aload 12
      //   590: ifnull +17 -> 607
      //   593: aload 13
      //   595: aload 12
      //   597: iconst_0
      //   598: aload 12
      //   600: arraylength
      //   601: invokestatic 231	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
      //   604: putfield 235	com/tencent/mapsdk/rastercore/d$d:g	Landroid/graphics/Bitmap;
      //   607: aload 13
      //   609: getfield 235	com/tencent/mapsdk/rastercore/d$d:g	Landroid/graphics/Bitmap;
      //   612: astore 12
      //   614: iload_2
      //   615: istore_3
      //   616: aload 12
      //   618: ifnonnull +5 -> 623
      //   621: iconst_1
      //   622: istore_3
      //   623: iload_3
      //   624: ifeq +110 -> 734
      //   627: aload 11
      //   629: ifnull +105 -> 734
      //   632: aload 11
      //   634: invokevirtual 238	java/lang/String:trim	()Ljava/lang/String;
      //   637: invokevirtual 146	java/lang/String:length	()I
      //   640: istore_2
      //   641: iload_2
      //   642: ifle +92 -> 734
      //   645: aconst_null
      //   646: astore 12
      //   648: new 103	java/net/URL
      //   651: dup
      //   652: aload 11
      //   654: invokespecial 120	java/net/URL:<init>	(Ljava/lang/String;)V
      //   657: invokevirtual 124	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   660: checkcast 126	java/net/HttpURLConnection
      //   663: astore 11
      //   665: aload 11
      //   667: ldc -16
      //   669: invokevirtual 243	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
      //   672: aload 11
      //   674: sipush 5000
      //   677: invokevirtual 247	java/net/HttpURLConnection:setConnectTimeout	(I)V
      //   680: aload 11
      //   682: invokevirtual 137	java/net/HttpURLConnection:getResponseCode	()I
      //   685: sipush 200
      //   688: if_icmpne +36 -> 724
      //   691: aload 11
      //   693: invokevirtual 159	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   696: invokestatic 167	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/InputStream;)[B
      //   699: astore 12
      //   701: aload 13
      //   703: aload 12
      //   705: iconst_0
      //   706: aload 12
      //   708: arraylength
      //   709: invokestatic 231	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
      //   712: putfield 235	com/tencent/mapsdk/rastercore/d$d:g	Landroid/graphics/Bitmap;
      //   715: aload 12
      //   717: invokestatic 220	com/tencent/mapsdk/rastercore/d$a:b	()Ljava/lang/String;
      //   720: invokestatic 250	com/tencent/mapsdk/rastercore/d$a:a	([BLjava/lang/String;)Z
      //   723: pop
      //   724: aload 11
      //   726: ifnull +8 -> 734
      //   729: aload 11
      //   731: invokevirtual 253	java/net/HttpURLConnection:disconnect	()V
      //   734: aload 14
      //   736: ldc -1
      //   738: invokevirtual 186	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
      //   741: astore 11
      //   743: aload 11
      //   745: ifnull +149 -> 894
      //   748: aload 11
      //   750: ldc_w 257
      //   753: invokevirtual 216	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
      //   756: astore 11
      //   758: aload 11
      //   760: invokestatic 87	com/tencent/mapsdk/rastercore/d:a	(Ljava/lang/String;)Z
      //   763: ifne +131 -> 894
      //   766: new 103	java/net/URL
      //   769: dup
      //   770: aload 11
      //   772: invokespecial 120	java/net/URL:<init>	(Ljava/lang/String;)V
      //   775: invokevirtual 124	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   778: checkcast 126	java/net/HttpURLConnection
      //   781: astore 11
      //   783: aload 11
      //   785: ldc -16
      //   787: invokevirtual 243	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
      //   790: aload 11
      //   792: sipush 5000
      //   795: invokevirtual 247	java/net/HttpURLConnection:setConnectTimeout	(I)V
      //   798: aload 11
      //   800: invokevirtual 137	java/net/HttpURLConnection:getResponseCode	()I
      //   803: sipush 200
      //   806: if_icmpne +88 -> 894
      //   809: new 155	java/util/zip/GZIPInputStream
      //   812: dup
      //   813: aload 11
      //   815: invokevirtual 159	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   818: invokespecial 162	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
      //   821: invokestatic 167	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/InputStream;)[B
      //   824: invokestatic 74	com/tencent/mapsdk/rastercore/d$a:c	()Ljava/lang/String;
      //   827: invokestatic 250	com/tencent/mapsdk/rastercore/d$a:a	([BLjava/lang/String;)Z
      //   830: pop
      //   831: getstatic 69	com/tencent/mapsdk/rastercore/d$a$a:a	Lcom/tencent/mapsdk/rastercore/d$a;
      //   834: astore 11
      //   836: invokestatic 74	com/tencent/mapsdk/rastercore/d$a:c	()Ljava/lang/String;
      //   839: invokestatic 77	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/lang/String;)[B
      //   842: astore 11
      //   844: aload 11
      //   846: ifnull +16 -> 862
      //   849: new 79	java/lang/String
      //   852: dup
      //   853: aload 11
      //   855: ldc 81
      //   857: invokespecial 84	java/lang/String:<init>	([BLjava/lang/String;)V
      //   860: astore 10
      //   862: aload 10
      //   864: invokestatic 87	com/tencent/mapsdk/rastercore/d:a	(Ljava/lang/String;)Z
      //   867: ifne +27 -> 894
      //   870: aload 10
      //   872: invokestatic 90	com/tencent/mapsdk/rastercore/d:c	(Ljava/lang/String;)[Ljava/lang/String;
      //   875: astore 10
      //   877: aload 10
      //   879: iconst_1
      //   880: aaload
      //   881: invokestatic 87	com/tencent/mapsdk/rastercore/d:a	(Ljava/lang/String;)Z
      //   884: ifne +10 -> 894
      //   887: aload 10
      //   889: iconst_1
      //   890: aaload
      //   891: invokestatic 101	com/tencent/mapsdk/rastercore/c:a	(Ljava/lang/String;)V
      //   894: getstatic 69	com/tencent/mapsdk/rastercore/d$a$a:a	Lcom/tencent/mapsdk/rastercore/d$a;
      //   897: aload 13
      //   899: getfield 48	com/tencent/mapsdk/rastercore/d$d:c	I
      //   902: iconst_2
      //   903: iload 6
      //   905: invokevirtual 205	com/tencent/mapsdk/rastercore/d$a:a	(III)Z
      //   908: pop
      //   909: getstatic 69	com/tencent/mapsdk/rastercore/d$a$a:a	Lcom/tencent/mapsdk/rastercore/d$a;
      //   912: aload_1
      //   913: iconst_1
      //   914: aaload
      //   915: aload 13
      //   917: getfield 48	com/tencent/mapsdk/rastercore/d$d:c	I
      //   920: iconst_1
      //   921: invokevirtual 208	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/lang/String;IZ)Z
      //   924: pop
      //   925: iload 4
      //   927: aload 13
      //   929: getfield 64	com/tencent/mapsdk/rastercore/d$d:f	I
      //   932: if_icmpeq +172 -> 1104
      //   935: iconst_1
      //   936: istore 7
      //   938: iload 6
      //   940: aload 13
      //   942: getfield 54	com/tencent/mapsdk/rastercore/d$d:d	I
      //   945: if_icmpeq +165 -> 1110
      //   948: iconst_1
      //   949: istore 8
      //   951: iload 5
      //   953: aload 13
      //   955: getfield 58	com/tencent/mapsdk/rastercore/d$d:e	I
      //   958: if_icmpeq +158 -> 1116
      //   961: new 10	com/tencent/mapsdk/rastercore/d$c$1
      //   964: dup
      //   965: aload_0
      //   966: iload 7
      //   968: iload 8
      //   970: iload 9
      //   972: invokespecial 260	com/tencent/mapsdk/rastercore/d$c$1:<init>	(Lcom/tencent/mapsdk/rastercore/d$c;ZZZ)V
      //   975: invokevirtual 263	com/tencent/mapsdk/rastercore/d$c$1:start	()V
      //   978: aload 13
      //   980: iload 4
      //   982: putfield 64	com/tencent/mapsdk/rastercore/d$d:f	I
      //   985: aload 13
      //   987: iload 6
      //   989: putfield 54	com/tencent/mapsdk/rastercore/d$d:d	I
      //   992: aload 13
      //   994: iload 5
      //   996: putfield 58	com/tencent/mapsdk/rastercore/d$d:e	I
      //   999: goto +148 -> 1147
      //   1002: astore 12
      //   1004: new 105	java/lang/StringBuilder
      //   1007: dup
      //   1008: ldc_w 265
      //   1011: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   1014: aload 12
      //   1016: invokevirtual 180	java/lang/Exception:toString	()Ljava/lang/String;
      //   1019: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1022: pop
      //   1023: iconst_1
      //   1024: istore_3
      //   1025: goto -402 -> 623
      //   1028: aload 11
      //   1030: ifnull -296 -> 734
      //   1033: aload 11
      //   1035: invokevirtual 253	java/net/HttpURLConnection:disconnect	()V
      //   1038: goto -304 -> 734
      //   1041: astore_1
      //   1042: new 105	java/lang/StringBuilder
      //   1045: dup
      //   1046: ldc_w 267
      //   1049: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   1052: aload_1
      //   1053: invokevirtual 270	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   1056: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1059: pop
      //   1060: goto +87 -> 1147
      //   1063: astore_1
      //   1064: aload 12
      //   1066: astore 11
      //   1068: aload 11
      //   1070: ifnull +8 -> 1078
      //   1073: aload 11
      //   1075: invokevirtual 253	java/net/HttpURLConnection:disconnect	()V
      //   1078: aload_1
      //   1079: athrow
      //   1080: astore 10
      //   1082: new 105	java/lang/StringBuilder
      //   1085: dup
      //   1086: ldc_w 272
      //   1089: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   1092: aload 10
      //   1094: invokevirtual 180	java/lang/Exception:toString	()Ljava/lang/String;
      //   1097: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1100: pop
      //   1101: goto -207 -> 894
      //   1104: iconst_0
      //   1105: istore 7
      //   1107: goto -169 -> 938
      //   1110: iconst_0
      //   1111: istore 8
      //   1113: goto -162 -> 951
      //   1116: iconst_0
      //   1117: istore 9
      //   1119: goto -158 -> 961
      //   1122: astore_1
      //   1123: goto -55 -> 1068
      //   1126: astore 12
      //   1128: goto -100 -> 1028
      //   1131: iconst_0
      //   1132: istore_2
      //   1133: goto -992 -> 141
      //   1136: iconst_0
      //   1137: istore_3
      //   1138: goto -976 -> 162
      //   1141: aconst_null
      //   1142: astore 10
      //   1144: goto -1036 -> 108
      //   1147: aload 13
      //   1149: areturn
      //   1150: iconst_0
      //   1151: istore_2
      //   1152: goto -578 -> 574
      //   1155: astore 11
      //   1157: aconst_null
      //   1158: astore 11
      //   1160: goto -132 -> 1028
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1163	0	this	c
      //   0	1163	1	paramVarArgs	String[]
      //   140	1012	2	i	int
      //   142	996	3	j	int
      //   425	556	4	k	int
      //   437	558	5	m	int
      //   545	443	6	n	int
      //   936	170	7	bool1	boolean
      //   949	163	8	bool2	boolean
      //   1	1117	9	bool3	boolean
      //   73	815	10	localObject1	Object
      //   1080	13	10	localException1	Exception
      //   1142	1	10	localObject2	Object
      //   84	215	11	localObject3	Object
      //   313	29	11	localException2	Exception
      //   346	728	11	localObject4	Object
      //   1155	1	11	localException3	Exception
      //   1158	1	11	localObject5	Object
      //   229	487	12	localObject6	Object
      //   1002	63	12	localException4	Exception
      //   1126	1	12	localException5	Exception
      //   10	1138	13	locald	d.d
      //   358	377	14	localJSONObject	JSONObject
      // Exception table:
      //   from	to	target	type
      //   78	86	313	java/lang/Exception
      //   91	104	313	java/lang/Exception
      //   593	607	1002	java/lang/Exception
      //   607	614	1002	java/lang/Exception
      //   162	231	1041	java/lang/Exception
      //   236	257	1041	java/lang/Exception
      //   263	277	1041	java/lang/Exception
      //   277	306	1041	java/lang/Exception
      //   341	348	1041	java/lang/Exception
      //   351	360	1041	java/lang/Exception
      //   368	377	1041	java/lang/Exception
      //   385	512	1041	java/lang/Exception
      //   520	572	1041	java/lang/Exception
      //   580	588	1041	java/lang/Exception
      //   632	641	1041	java/lang/Exception
      //   729	734	1041	java/lang/Exception
      //   894	935	1041	java/lang/Exception
      //   938	948	1041	java/lang/Exception
      //   951	961	1041	java/lang/Exception
      //   961	999	1041	java/lang/Exception
      //   1004	1023	1041	java/lang/Exception
      //   1033	1038	1041	java/lang/Exception
      //   1073	1078	1041	java/lang/Exception
      //   1078	1080	1041	java/lang/Exception
      //   1082	1101	1041	java/lang/Exception
      //   648	665	1063	finally
      //   734	743	1080	java/lang/Exception
      //   748	844	1080	java/lang/Exception
      //   849	862	1080	java/lang/Exception
      //   862	894	1080	java/lang/Exception
      //   665	724	1122	finally
      //   665	724	1126	java/lang/Exception
      //   648	665	1155	java/lang/Exception
    }
  }
  
  static final class d
  {
    public int a = 1000;
    public int b = b.a;
    public int c = 1000;
    public int d = b.c;
    public int e = b.d;
    public int f = b.b;
    public Bitmap g = null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */