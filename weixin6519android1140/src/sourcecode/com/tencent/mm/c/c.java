package com.tencent.mm.c;

import com.tencent.gmtrace.GMTrace;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipException;

public final class c
{
  public static final k erd;
  public static final k ere;
  private static int erf;
  private static final k erg;
  
  static
  {
    GMTrace.i(14025081487360L, 104495);
    erd = new k(84298576L);
    ere = new k(50613072L);
    erf = 0;
    erg = new k(101010256L);
    GMTrace.o(14025081487360L, 104495);
  }
  
  /* Error */
  public static void b(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc2_w 51
    //   6: ldc 53
    //   8: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: new 55	java/io/RandomAccessFile
    //   14: dup
    //   15: aload_0
    //   16: ldc 57
    //   18: invokespecial 59	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic 62	com/tencent/mm/c/c:b	(Ljava/io/RandomAccessFile;)[B
    //   26: astore_0
    //   27: aload_0
    //   28: ifnonnull +129 -> 157
    //   31: aload 4
    //   33: astore_0
    //   34: new 6	com/tencent/mm/c/c$a
    //   37: dup
    //   38: invokespecial 64	com/tencent/mm/c/c$a:<init>	()V
    //   41: astore 4
    //   43: aload 4
    //   45: aload_0
    //   46: invokevirtual 68	com/tencent/mm/c/c$a:t	([B)V
    //   49: aload 4
    //   51: getfield 72	com/tencent/mm/c/c$a:erh	Ljava/util/Properties;
    //   54: ldc 74
    //   56: aload_1
    //   57: invokevirtual 80	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   60: pop
    //   61: aload 4
    //   63: invokevirtual 84	com/tencent/mm/c/c$a:oO	()[B
    //   66: astore_0
    //   67: aload_3
    //   68: getstatic 40	com/tencent/mm/c/c:erf	I
    //   71: i2l
    //   72: invokevirtual 87	java/io/RandomAccessFile:seek	(J)V
    //   75: aload_3
    //   76: new 89	com/tencent/mm/c/l
    //   79: dup
    //   80: aload_0
    //   81: arraylength
    //   82: invokespecial 92	com/tencent/mm/c/l:<init>	(I)V
    //   85: invokevirtual 95	com/tencent/mm/c/l:getBytes	()[B
    //   88: invokevirtual 98	java/io/RandomAccessFile:write	([B)V
    //   91: aload_3
    //   92: aload_0
    //   93: invokevirtual 98	java/io/RandomAccessFile:write	([B)V
    //   96: getstatic 40	com/tencent/mm/c/c:erf	I
    //   99: istore_2
    //   100: aload_3
    //   101: aload_0
    //   102: arraylength
    //   103: iload_2
    //   104: iadd
    //   105: iconst_2
    //   106: iadd
    //   107: i2l
    //   108: invokevirtual 101	java/io/RandomAccessFile:setLength	(J)V
    //   111: getstatic 107	java/lang/System:err	Ljava/io/PrintStream;
    //   114: new 109	java/lang/StringBuilder
    //   117: dup
    //   118: ldc 111
    //   120: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   123: aload_3
    //   124: invokevirtual 118	java/io/RandomAccessFile:length	()J
    //   127: invokevirtual 122	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   130: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: invokevirtual 131	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   136: aload_3
    //   137: invokevirtual 134	java/io/RandomAccessFile:close	()V
    //   140: getstatic 107	java/lang/System:err	Ljava/io/PrintStream;
    //   143: ldc -120
    //   145: invokevirtual 131	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   148: ldc2_w 51
    //   151: ldc 53
    //   153: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   156: return
    //   157: aload_0
    //   158: invokestatic 142	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   161: astore 4
    //   163: getstatic 34	com/tencent/mm/c/c:erd	Lcom/tencent/mm/c/k;
    //   166: invokevirtual 143	com/tencent/mm/c/k:getBytes	()[B
    //   169: pop
    //   170: iconst_4
    //   171: newarray <illegal type>
    //   173: astore 5
    //   175: aload 4
    //   177: aload 5
    //   179: invokevirtual 146	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   182: pop
    //   183: getstatic 34	com/tencent/mm/c/c:erd	Lcom/tencent/mm/c/k;
    //   186: new 26	com/tencent/mm/c/k
    //   189: dup
    //   190: aload 5
    //   192: invokespecial 148	com/tencent/mm/c/k:<init>	([B)V
    //   195: invokevirtual 152	com/tencent/mm/c/k:equals	(Ljava/lang/Object;)Z
    //   198: ifeq +6 -> 204
    //   201: goto -167 -> 34
    //   204: getstatic 38	com/tencent/mm/c/c:ere	Lcom/tencent/mm/c/k;
    //   207: new 26	com/tencent/mm/c/k
    //   210: dup
    //   211: aload 5
    //   213: invokespecial 148	com/tencent/mm/c/k:<init>	([B)V
    //   216: invokevirtual 152	com/tencent/mm/c/k:equals	(Ljava/lang/Object;)Z
    //   219: ifeq +6 -> 225
    //   222: goto -188 -> 34
    //   225: new 154	java/io/ByteArrayOutputStream
    //   228: dup
    //   229: invokespecial 155	java/io/ByteArrayOutputStream:<init>	()V
    //   232: astore 4
    //   234: aload 4
    //   236: getstatic 38	com/tencent/mm/c/c:ere	Lcom/tencent/mm/c/k;
    //   239: invokevirtual 143	com/tencent/mm/c/k:getBytes	()[B
    //   242: invokevirtual 156	java/io/ByteArrayOutputStream:write	([B)V
    //   245: aload 4
    //   247: new 89	com/tencent/mm/c/l
    //   250: dup
    //   251: aload_0
    //   252: arraylength
    //   253: invokespecial 92	com/tencent/mm/c/l:<init>	(I)V
    //   256: invokevirtual 95	com/tencent/mm/c/l:getBytes	()[B
    //   259: invokevirtual 156	java/io/ByteArrayOutputStream:write	([B)V
    //   262: aload 4
    //   264: aload_0
    //   265: invokevirtual 156	java/io/ByteArrayOutputStream:write	([B)V
    //   268: aload 4
    //   270: invokevirtual 159	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   273: astore_0
    //   274: goto -240 -> 34
    //   277: astore_0
    //   278: aconst_null
    //   279: astore_1
    //   280: aload_1
    //   281: ifnull +7 -> 288
    //   284: aload_1
    //   285: invokevirtual 134	java/io/RandomAccessFile:close	()V
    //   288: getstatic 107	java/lang/System:err	Ljava/io/PrintStream;
    //   291: ldc -120
    //   293: invokevirtual 131	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   296: aload_0
    //   297: athrow
    //   298: astore_0
    //   299: aload_3
    //   300: astore_1
    //   301: goto -21 -> 280
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	304	0	paramFile	File
    //   0	304	1	paramString	String
    //   99	6	2	i	int
    //   21	279	3	localRandomAccessFile	RandomAccessFile
    //   1	268	4	localObject	Object
    //   173	39	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   11	22	277	finally
    //   22	27	298	finally
    //   34	136	298	finally
    //   157	201	298	finally
    //   204	222	298	finally
    //   225	274	298	finally
  }
  
  private static byte[] b(RandomAccessFile paramRandomAccessFile)
  {
    GMTrace.i(14025215705088L, 104496);
    long l = paramRandomAccessFile.length() - 22L;
    paramRandomAccessFile.seek(l);
    byte[] arrayOfByte = erg.getBytes();
    int i = paramRandomAccessFile.read();
    int j = 0;
    for (;;)
    {
      if (i == -1) {}
      for (i = j;; i = 1)
      {
        if (i != 0) {
          break label129;
        }
        System.err.println("archive is not a ZIP archive");
        throw new ZipException("archive is not a ZIP archive");
        if ((i != arrayOfByte[0]) || (paramRandomAccessFile.read() != arrayOfByte[1]) || (paramRandomAccessFile.read() != arrayOfByte[2]) || (paramRandomAccessFile.read() != arrayOfByte[3])) {
          break;
        }
      }
      l -= 1L;
      paramRandomAccessFile.seek(l);
      i = paramRandomAccessFile.read();
    }
    label129:
    paramRandomAccessFile.seek(16L + l + 4L);
    if (erf != 16L + l + 4L) {
      erf = (int)(16L + l + 4L);
    }
    arrayOfByte = new byte[2];
    paramRandomAccessFile.readFully(arrayOfByte);
    System.err.println("readComment:length bytes data = " + s(arrayOfByte));
    i = new l(arrayOfByte).value;
    if (i == 0)
    {
      GMTrace.o(14025215705088L, 104496);
      return null;
    }
    arrayOfByte = new byte[i];
    paramRandomAccessFile.read(arrayOfByte);
    GMTrace.o(14025215705088L, 104496);
    return arrayOfByte;
  }
  
  public static String j(File paramFile)
  {
    GMTrace.i(14025484140544L, 104498);
    System.err.println("enter getSecurityCode");
    System.err.println("apkFile filename:" + paramFile.getName());
    try
    {
      localRandomAccessFile = new RandomAccessFile(paramFile, "r");
      a locala;
      if (localRandomAccessFile == null) {
        break label155;
      }
    }
    finally
    {
      try
      {
        paramFile = b(localRandomAccessFile);
        if (paramFile == null)
        {
          System.err.println("null == readComment");
          System.err.println("exit");
          localRandomAccessFile.close();
          System.err.println("exit getSecurityCode");
          GMTrace.o(14025484140544L, 104498);
          return null;
        }
        locala = new a();
        locala.t(paramFile);
        paramFile = locala.erh.getProperty("apkSecurityCode");
        localRandomAccessFile.close();
        System.err.println("exit getSecurityCode");
        GMTrace.o(14025484140544L, 104498);
        return paramFile;
      }
      finally
      {
        RandomAccessFile localRandomAccessFile;
        for (;;) {}
      }
      paramFile = finally;
      localRandomAccessFile = null;
    }
    localRandomAccessFile.close();
    label155:
    System.err.println("exit getSecurityCode");
    throw paramFile;
  }
  
  private static String s(byte[] paramArrayOfByte)
  {
    GMTrace.i(14025618358272L, 104499);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    for (;;)
    {
      if (i >= 2)
      {
        paramArrayOfByte = localStringBuilder.toString();
        GMTrace.o(14025618358272L, 104499);
        return paramArrayOfByte;
      }
      localStringBuilder.append(paramArrayOfByte[i]);
      localStringBuilder.append(",");
      i += 1;
    }
  }
  
  private static final class a
  {
    Properties erh;
    byte[] eri;
    
    public a()
    {
      GMTrace.i(14024544616448L, 104491);
      this.erh = new Properties();
      GMTrace.o(14024544616448L, 104491);
    }
    
    final byte[] oO()
    {
      GMTrace.i(14024813051904L, 104493);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      Iterator localIterator;
      if (this.erh.size() > 0)
      {
        localByteArrayOutputStream.write(c.erd.getBytes());
        localIterator = this.erh.keySet().iterator();
      }
      Object localObject2;
      for (Object localObject1 = "";; localObject1 = localObject1 + localObject2 + "=" + this.erh.getProperty((String)localObject2) + "\r\n")
      {
        if (!localIterator.hasNext())
        {
          localObject1 = ((String)localObject1).getBytes();
          localByteArrayOutputStream.write(new l(localObject1.length).getBytes());
          localByteArrayOutputStream.write((byte[])localObject1);
          if ((this.eri != null) && (this.eri.length > 0))
          {
            localByteArrayOutputStream.write(c.ere.getBytes());
            localByteArrayOutputStream.write(new l(this.eri.length).getBytes());
            localByteArrayOutputStream.write(this.eri);
          }
          localObject1 = localByteArrayOutputStream.toByteArray();
          GMTrace.o(14024813051904L, 104493);
          return (byte[])localObject1;
        }
        localObject2 = localIterator.next();
      }
    }
    
    final void t(byte[] paramArrayOfByte)
    {
      GMTrace.i(14024678834176L, 104492);
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      {
        GMTrace.o(14024678834176L, 104492);
        return;
      }
      ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
      c.erd.getBytes();
      byte[] arrayOfByte = new byte[4];
      localByteBuffer.get(arrayOfByte);
      System.out.println("securityPart: " + new k(arrayOfByte).value);
      int i;
      if (c.erd.equals(new k(arrayOfByte)))
      {
        if (paramArrayOfByte.length - 4 <= 2)
        {
          System.err.println("data.length - securityMarkLength <= 2");
          GMTrace.o(14024678834176L, 104492);
          return;
        }
        arrayOfByte = new byte[2];
        localByteBuffer.get(arrayOfByte);
        i = new l(arrayOfByte).value;
        if (paramArrayOfByte.length - 4 - 2 < i)
        {
          System.err.println("data.length - securityMarkLength - 2 < len");
          System.err.println("exit");
          GMTrace.o(14024678834176L, 104492);
          return;
        }
        arrayOfByte = new byte[i];
        localByteBuffer.get(arrayOfByte);
        this.erh.load(new ByteArrayInputStream(arrayOfByte));
        i = paramArrayOfByte.length - 4 - i - 2;
        if (i > 0)
        {
          c.ere.getBytes();
          paramArrayOfByte = new byte[4];
          localByteBuffer.get(paramArrayOfByte);
          if (c.ere.equals(new k(paramArrayOfByte)))
          {
            if (i - 4 <= 2)
            {
              System.err.println("data.length - oriMarkLength <= 2");
              GMTrace.o(14024678834176L, 104492);
              return;
            }
            paramArrayOfByte = new byte[2];
            localByteBuffer.get(paramArrayOfByte);
            int j = new l(paramArrayOfByte).value;
            if (i - 4 - 2 < j)
            {
              System.err.println("data.length - oriMarkLength - 2 < len");
              System.err.println("exit");
              GMTrace.o(14024678834176L, 104492);
              return;
            }
            this.eri = new byte[j];
            localByteBuffer.get(this.eri);
            GMTrace.o(14024678834176L, 104492);
          }
        }
      }
      else
      {
        if (c.ere.equals(new k(arrayOfByte)))
        {
          c.ere.getBytes();
          if (paramArrayOfByte.length - 4 <= 2)
          {
            System.err.println("data.length - oriMarkLength <= 2");
            GMTrace.o(14024678834176L, 104492);
            return;
          }
          arrayOfByte = new byte[2];
          localByteBuffer.get(arrayOfByte);
          i = new l(arrayOfByte).value;
          if (paramArrayOfByte.length - 4 - 2 < i)
          {
            System.err.println("data.length - oriMarkLength - 2 < len");
            System.err.println("exit");
            GMTrace.o(14024678834176L, 104492);
            return;
          }
          this.eri = new byte[i];
          localByteBuffer.get(this.eri);
          GMTrace.o(14024678834176L, 104492);
          return;
        }
        throw new ProtocolException("unknow protocl [" + Arrays.toString(paramArrayOfByte) + "]");
      }
      GMTrace.o(14024678834176L, 104492);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */