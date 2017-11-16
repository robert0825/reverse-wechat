package com.tencent.tinker.loader.shareutil;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class ShareElfFile
  implements Closeable
{
  private final FileInputStream jbE;
  private final Map<String, SectionHeader> yhL = new HashMap();
  public ElfHeader yhM = null;
  public ProgramHeader[] yhN = null;
  public SectionHeader[] yhO = null;
  
  public ShareElfFile(File paramFile)
  {
    this.jbE = new FileInputStream(paramFile);
    Object localObject = this.jbE.getChannel();
    this.yhM = new ElfHeader((FileChannel)localObject);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(128);
    localByteBuffer.limit(this.yhM.yhY);
    if (this.yhM.yhP[5] == 1) {}
    for (paramFile = ByteOrder.LITTLE_ENDIAN;; paramFile = ByteOrder.BIG_ENDIAN)
    {
      localByteBuffer.order(paramFile);
      ((FileChannel)localObject).position(this.yhM.yhU);
      this.yhN = new ProgramHeader[this.yhM.yhZ];
      i = 0;
      while (i < this.yhN.length)
      {
        a((FileChannel)localObject, localByteBuffer, "failed to read phdr.");
        this.yhN[i] = new ProgramHeader(localByteBuffer, this.yhM.yhP[4]);
        i += 1;
      }
    }
    ((FileChannel)localObject).position(this.yhM.yhV);
    localByteBuffer.limit(this.yhM.yia);
    this.yhO = new SectionHeader[this.yhM.yib];
    int i = 0;
    while (i < this.yhO.length)
    {
      a((FileChannel)localObject, localByteBuffer, "failed to read shdr.");
      this.yhO[i] = new SectionHeader(localByteBuffer, this.yhM.yhP[4]);
      i += 1;
    }
    if (this.yhM.yic > 0)
    {
      localObject = this.yhO[this.yhM.yic];
      paramFile = ByteBuffer.allocate((int)((SectionHeader)localObject).yiq);
      this.jbE.getChannel().position(((SectionHeader)localObject).yip);
      a(this.jbE.getChannel(), paramFile, "failed to read section: " + ((SectionHeader)localObject).yiv);
      localObject = this.yhO;
      int k = localObject.length;
      i = j;
      while (i < k)
      {
        localByteBuffer = localObject[i];
        paramFile.position(localByteBuffer.yil);
        localByteBuffer.yiv = o(paramFile);
        this.yhL.put(localByteBuffer.yiv, localByteBuffer);
        i += 1;
      }
    }
  }
  
  /* Error */
  public static int X(File paramFile)
  {
    // Byte code:
    //   0: iconst_4
    //   1: newarray <illegal type>
    //   3: astore_3
    //   4: new 46	java/io/FileInputStream
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 48	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   12: astore_2
    //   13: aload_2
    //   14: aload_3
    //   15: invokevirtual 177	java/io/InputStream:read	([B)I
    //   18: pop
    //   19: aload_3
    //   20: iconst_0
    //   21: baload
    //   22: bipush 100
    //   24: if_icmpne +35 -> 59
    //   27: aload_3
    //   28: iconst_1
    //   29: baload
    //   30: bipush 101
    //   32: if_icmpne +27 -> 59
    //   35: aload_3
    //   36: iconst_2
    //   37: baload
    //   38: bipush 121
    //   40: if_icmpne +19 -> 59
    //   43: aload_3
    //   44: iconst_3
    //   45: baload
    //   46: istore_1
    //   47: iload_1
    //   48: bipush 10
    //   50: if_icmpne +9 -> 59
    //   53: aload_2
    //   54: invokevirtual 180	java/io/InputStream:close	()V
    //   57: iconst_0
    //   58: ireturn
    //   59: aload_3
    //   60: iconst_0
    //   61: baload
    //   62: bipush 127
    //   64: if_icmpne +33 -> 97
    //   67: aload_3
    //   68: iconst_1
    //   69: baload
    //   70: bipush 69
    //   72: if_icmpne +25 -> 97
    //   75: aload_3
    //   76: iconst_2
    //   77: baload
    //   78: bipush 76
    //   80: if_icmpne +17 -> 97
    //   83: aload_3
    //   84: iconst_3
    //   85: baload
    //   86: bipush 70
    //   88: if_icmpne +9 -> 97
    //   91: aload_2
    //   92: invokevirtual 180	java/io/InputStream:close	()V
    //   95: iconst_1
    //   96: ireturn
    //   97: aload_2
    //   98: invokevirtual 180	java/io/InputStream:close	()V
    //   101: iconst_m1
    //   102: ireturn
    //   103: astore_0
    //   104: aconst_null
    //   105: astore_2
    //   106: aload_2
    //   107: ifnull +7 -> 114
    //   110: aload_2
    //   111: invokevirtual 180	java/io/InputStream:close	()V
    //   114: aload_0
    //   115: athrow
    //   116: astore_0
    //   117: iconst_0
    //   118: ireturn
    //   119: astore_0
    //   120: goto -25 -> 95
    //   123: astore_0
    //   124: goto -23 -> 101
    //   127: astore_2
    //   128: goto -14 -> 114
    //   131: astore_0
    //   132: goto -26 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	paramFile	File
    //   46	5	1	i	int
    //   12	99	2	localFileInputStream	FileInputStream
    //   127	1	2	localThrowable	Throwable
    //   3	81	3	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   0	13	103	finally
    //   53	57	116	java/lang/Throwable
    //   91	95	119	java/lang/Throwable
    //   97	101	123	java/lang/Throwable
    //   110	114	127	java/lang/Throwable
    //   13	19	131	finally
  }
  
  public static void a(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, String paramString)
  {
    paramByteBuffer.rewind();
    int i = paramFileChannel.read(paramByteBuffer);
    if (i != paramByteBuffer.limit()) {
      throw new IOException(paramString + " Rest bytes insufficient, expect to read " + paramByteBuffer.limit() + " bytes but only " + i + " bytes were read.");
    }
    paramByteBuffer.flip();
  }
  
  private static String o(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = paramByteBuffer.array();
    int i = paramByteBuffer.position();
    while ((paramByteBuffer.hasRemaining()) && (arrayOfByte[paramByteBuffer.position()] != 0)) {
      paramByteBuffer.position(paramByteBuffer.position() + 1);
    }
    paramByteBuffer.position(paramByteBuffer.position() + 1);
    return new String(arrayOfByte, i, paramByteBuffer.position() - i - 1, Charset.forName("ASCII"));
  }
  
  public static void z(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 <= 0) || (paramInt1 > paramInt2)) {
      throw new IOException(paramString);
    }
  }
  
  public void close()
  {
    this.jbE.close();
    this.yhL.clear();
    this.yhN = null;
    this.yhO = null;
  }
  
  public static class ElfHeader
  {
    public final byte[] yhP = new byte[16];
    public final short yhQ;
    public final short yhR;
    public final int yhS;
    public final long yhT;
    public final long yhU;
    public final long yhV;
    public final int yhW;
    public final short yhX;
    public final short yhY;
    public final short yhZ;
    public final short yia;
    public final short yib;
    public final short yic;
    
    public ElfHeader(FileChannel paramFileChannel)
    {
      paramFileChannel.position(0L);
      paramFileChannel.read(ByteBuffer.wrap(this.yhP));
      if ((this.yhP[0] != Byte.MAX_VALUE) || (this.yhP[1] != 69) || (this.yhP[2] != 76) || (this.yhP[3] != 70)) {
        throw new IOException(String.format("bad elf magic: %x %x %x %x.", new Object[] { Byte.valueOf(this.yhP[0]), Byte.valueOf(this.yhP[1]), Byte.valueOf(this.yhP[2]), Byte.valueOf(this.yhP[3]) }));
      }
      ShareElfFile.z(this.yhP[4], 2, "bad elf class: " + this.yhP[4]);
      ShareElfFile.z(this.yhP[5], 2, "bad elf data encoding: " + this.yhP[5]);
      int i;
      label214:
      ByteBuffer localByteBuffer;
      if (this.yhP[4] == 1)
      {
        i = 36;
        localByteBuffer = ByteBuffer.allocate(i);
        if (this.yhP[5] != 1) {
          break label367;
        }
      }
      label367:
      for (ByteOrder localByteOrder = ByteOrder.LITTLE_ENDIAN;; localByteOrder = ByteOrder.BIG_ENDIAN)
      {
        localByteBuffer.order(localByteOrder);
        ShareElfFile.a(paramFileChannel, localByteBuffer, "failed to read rest part of ehdr.");
        this.yhQ = localByteBuffer.getShort();
        this.yhR = localByteBuffer.getShort();
        this.yhS = localByteBuffer.getInt();
        ShareElfFile.z(this.yhS, 1, "bad elf version: " + this.yhS);
        switch (this.yhP[4])
        {
        default: 
          throw new IOException("Unexpected elf class: " + this.yhP[4]);
          i = 48;
          break label214;
        }
      }
      this.yhT = localByteBuffer.getInt();
      this.yhU = localByteBuffer.getInt();
      for (this.yhV = localByteBuffer.getInt();; this.yhV = localByteBuffer.getLong())
      {
        this.yhW = localByteBuffer.getInt();
        this.yhX = localByteBuffer.getShort();
        this.yhY = localByteBuffer.getShort();
        this.yhZ = localByteBuffer.getShort();
        this.yia = localByteBuffer.getShort();
        this.yib = localByteBuffer.getShort();
        this.yic = localByteBuffer.getShort();
        return;
        this.yhT = localByteBuffer.getLong();
        this.yhU = localByteBuffer.getLong();
      }
    }
  }
  
  public static class ProgramHeader
  {
    public final int yid;
    public final int yie;
    public final long yif;
    public final long yig;
    public final long yih;
    public final long yii;
    public final long yij;
    public final long yik;
    
    public ProgramHeader(ByteBuffer paramByteBuffer, int paramInt)
    {
      switch (paramInt)
      {
      default: 
        throw new IOException("Unexpected elf class: " + paramInt);
      case 1: 
        this.yid = paramByteBuffer.getInt();
        this.yif = paramByteBuffer.getInt();
        this.yig = paramByteBuffer.getInt();
        this.yih = paramByteBuffer.getInt();
        this.yii = paramByteBuffer.getInt();
        this.yij = paramByteBuffer.getInt();
        this.yie = paramByteBuffer.getInt();
        this.yik = paramByteBuffer.getInt();
        return;
      }
      this.yid = paramByteBuffer.getInt();
      this.yie = paramByteBuffer.getInt();
      this.yif = paramByteBuffer.getLong();
      this.yig = paramByteBuffer.getLong();
      this.yih = paramByteBuffer.getLong();
      this.yii = paramByteBuffer.getLong();
      this.yij = paramByteBuffer.getLong();
      this.yik = paramByteBuffer.getLong();
    }
  }
  
  public static class SectionHeader
  {
    public final int yil;
    public final int yim;
    public final long yin;
    public final long yio;
    public final long yip;
    public final long yiq;
    public final int yir;
    public final int yis;
    public final long yit;
    public final long yiu;
    public String yiv;
    
    public SectionHeader(ByteBuffer paramByteBuffer, int paramInt)
    {
      switch (paramInt)
      {
      default: 
        throw new IOException("Unexpected elf class: " + paramInt);
      case 1: 
        this.yil = paramByteBuffer.getInt();
        this.yim = paramByteBuffer.getInt();
        this.yin = paramByteBuffer.getInt();
        this.yio = paramByteBuffer.getInt();
        this.yip = paramByteBuffer.getInt();
        this.yiq = paramByteBuffer.getInt();
        this.yir = paramByteBuffer.getInt();
        this.yis = paramByteBuffer.getInt();
        this.yit = paramByteBuffer.getInt();
      }
      for (this.yiu = paramByteBuffer.getInt();; this.yiu = paramByteBuffer.getLong())
      {
        this.yiv = null;
        return;
        this.yil = paramByteBuffer.getInt();
        this.yim = paramByteBuffer.getInt();
        this.yin = paramByteBuffer.getLong();
        this.yio = paramByteBuffer.getLong();
        this.yip = paramByteBuffer.getLong();
        this.yiq = paramByteBuffer.getLong();
        this.yir = paramByteBuffer.getInt();
        this.yis = paramByteBuffer.getInt();
        this.yit = paramByteBuffer.getLong();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\tinker\loader\shareutil\ShareElfFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */