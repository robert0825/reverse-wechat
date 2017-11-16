package com.tencent.mm.compatible.util;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exif
{
  public static final int PARSE_EXIF_ERROR_CORRUPT = 1985;
  public static final int PARSE_EXIF_ERROR_NO_EXIF = 1983;
  public static final int PARSE_EXIF_ERROR_NO_JPEG = 1982;
  public static final int PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN = 1984;
  public static final int PARSE_EXIF_SUCCESS = 0;
  private static final String TAG = "MicroMsg.Exif";
  public double altitude;
  public short bitsPerSample;
  public String copyright;
  public String dateTime;
  public String dateTimeDigitized;
  public String dateTimeOriginal;
  public double exposureBiasValue;
  public double exposureTime;
  public double fNumber;
  public byte flash;
  public double focalLength;
  public short focalLengthIn35mm;
  public String imageDescription;
  public int imageHeight;
  public int imageWidth;
  public short isoSpeedRatings;
  public double latitude;
  public double longitude;
  public String make;
  public short meteringMode;
  public String model;
  public short orientation;
  public double shutterSpeedValue;
  public String software;
  public String subSecTimeOriginal;
  public double subjectDistance;
  
  public Exif()
  {
    GMTrace.i(13784965971968L, 102706);
    this.latitude = -1.0D;
    this.longitude = -1.0D;
    this.altitude = 0.0D;
    GMTrace.o(13784965971968L, 102706);
  }
  
  public static Exif fromFile(String paramString)
  {
    GMTrace.i(13786308149248L, 102716);
    Exif localExif = new Exif();
    try
    {
      int i = localExif.parseFromFile(paramString);
      w.i("MicroMsg.Exif", "parse EXIF, result: " + i);
      GMTrace.o(13786308149248L, 102716);
      return localExif;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        w.w("MicroMsg.Exif", "parse EXIF failed: " + paramString.getMessage());
      }
    }
  }
  
  private native int nativeParse(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  private native int nativeParseFile(String paramString);
  
  public a getLocation()
  {
    GMTrace.i(13785771278336L, 102712);
    if ((this.latitude < 0.0D) || (this.longitude < 0.0D))
    {
      GMTrace.o(13785771278336L, 102712);
      return null;
    }
    a locala = new a(this.latitude, this.longitude, this.altitude);
    GMTrace.o(13785771278336L, 102712);
    return locala;
  }
  
  public int getOrientationInDegree()
  {
    GMTrace.i(13785637060608L, 102711);
    switch (this.orientation)
    {
    case 4: 
    case 5: 
    case 7: 
    default: 
      GMTrace.o(13785637060608L, 102711);
      return 0;
    case 6: 
      GMTrace.o(13785637060608L, 102711);
      return 90;
    case 3: 
      GMTrace.o(13785637060608L, 102711);
      return 180;
    }
    GMTrace.o(13785637060608L, 102711);
    return 270;
  }
  
  public long getUxtimeDatatimeOriginal()
  {
    GMTrace.i(13786173931520L, 102715);
    try
    {
      String str = this.dateTimeOriginal;
      if (str == null)
      {
        GMTrace.o(13786173931520L, 102715);
        return 0L;
      }
      long l = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").parse(this.dateTimeOriginal).getTime() / 1000L;
      GMTrace.o(13786173931520L, 102715);
      return l;
    }
    catch (ParseException localParseException)
    {
      w.printErrStackTrace("MicroMsg.Exif", localParseException, "", new Object[0]);
      GMTrace.o(13786173931520L, 102715);
    }
    return 0L;
  }
  
  public int parseFrom(byte[] paramArrayOfByte)
  {
    GMTrace.i(13785368625152L, 102709);
    int i = nativeParse(paramArrayOfByte, 0, paramArrayOfByte.length);
    GMTrace.o(13785368625152L, 102709);
    return i;
  }
  
  public int parseFrom(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(13785502842880L, 102710);
    paramInt1 = nativeParse(paramArrayOfByte, paramInt1, paramInt2);
    GMTrace.o(13785502842880L, 102710);
    return paramInt1;
  }
  
  /* Error */
  public int parseFromFile(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 179
    //   3: ldc -75
    //   5: invokestatic 64	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 183	java/io/File
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 184	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: invokevirtual 188	java/io/File:exists	()Z
    //   19: ifeq +41 -> 60
    //   22: aload_0
    //   23: aload_1
    //   24: invokespecial 190	com/tencent/mm/compatible/util/Exif:nativeParseFile	(Ljava/lang/String;)I
    //   27: istore_2
    //   28: ldc 22
    //   30: ldc -64
    //   32: iconst_2
    //   33: anewarray 4	java/lang/Object
    //   36: dup
    //   37: iconst_0
    //   38: iload_2
    //   39: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   42: aastore
    //   43: dup
    //   44: iconst_1
    //   45: aload_1
    //   46: aastore
    //   47: invokestatic 201	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   50: ldc2_w 179
    //   53: ldc -75
    //   55: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   58: iload_2
    //   59: ireturn
    //   60: aconst_null
    //   61: astore_3
    //   62: aload_1
    //   63: invokestatic 207	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   66: astore_1
    //   67: aload_1
    //   68: astore_3
    //   69: aload_0
    //   70: aload_1
    //   71: invokevirtual 211	com/tencent/mm/compatible/util/Exif:parseFromStream	(Ljava/io/InputStream;)I
    //   74: istore_2
    //   75: aload_1
    //   76: ifnull +7 -> 83
    //   79: aload_1
    //   80: invokevirtual 216	java/io/InputStream:close	()V
    //   83: ldc2_w 179
    //   86: ldc -75
    //   88: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   91: iload_2
    //   92: ireturn
    //   93: astore_1
    //   94: aload_3
    //   95: ifnull +7 -> 102
    //   98: aload_3
    //   99: invokevirtual 216	java/io/InputStream:close	()V
    //   102: aload_1
    //   103: athrow
    //   104: astore_1
    //   105: goto -22 -> 83
    //   108: astore_3
    //   109: goto -7 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	Exif
    //   0	112	1	paramString	String
    //   27	65	2	i	int
    //   61	38	3	str	String
    //   108	1	3	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   62	67	93	finally
    //   69	75	93	finally
    //   79	83	104	java/io/IOException
    //   98	102	108	java/io/IOException
  }
  
  public int parseFromStream(InputStream paramInputStream)
  {
    GMTrace.i(13785234407424L, 102708);
    byte[] arrayOfByte = new byte[65536];
    int i = paramInputStream.read(arrayOfByte);
    if (i <= 0)
    {
      GMTrace.o(13785234407424L, 102708);
      return 1982;
    }
    i = nativeParse(arrayOfByte, 0, i);
    w.i("MicroMsg.Exif", "parse EXIF from Stream, ret = " + i);
    GMTrace.o(13785234407424L, 102708);
    return i;
  }
  
  public static final class a
  {
    public double altitude;
    public double latitude;
    public double longitude;
    
    public a(double paramDouble1, double paramDouble2, double paramDouble3)
    {
      GMTrace.i(13787918761984L, 102728);
      this.latitude = paramDouble1;
      this.longitude = paramDouble2;
      this.altitude = paramDouble3;
      GMTrace.o(13787918761984L, 102728);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\util\Exif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */