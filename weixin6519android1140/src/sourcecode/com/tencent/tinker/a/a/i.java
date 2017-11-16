package com.tencent.tinker.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import java.util.zip.Adler32;

public final class i
{
  static final short[] ycH = new short[0];
  public final t ycI = new t();
  public final f ycJ = new f((byte)0);
  private final g ycK = new g((byte)0);
  private final h ycL = new h((byte)0);
  private final d ycM = new d((byte)0);
  private final b ycN = new b((byte)0);
  private final c ycO = new c((byte)0);
  private final a ycP = new a((byte)0);
  public ByteBuffer ycQ;
  private int ycR = 0;
  private byte[] ycS = null;
  
  public i(int paramInt)
  {
    this.ycQ = ByteBuffer.wrap(new byte[paramInt]);
    this.ycQ.order(ByteOrder.LITTLE_ENDIAN);
    this.ycI.fileSize = paramInt;
  }
  
  public i(InputStream paramInputStream)
  {
    this.ycQ = ByteBuffer.wrap(com.tencent.tinker.a.a.b.d.b(paramInputStream, 0));
    this.ycQ.order(ByteOrder.LITTLE_ENDIAN);
    paramInputStream = this.ycI;
    e locale = a(paramInputStream.yde);
    byte[] arrayOfByte = locale.Ft(8);
    int i = j;
    if (arrayOfByte.length == 8)
    {
      i = j;
      if (arrayOfByte[0] == 100)
      {
        i = j;
        if (arrayOfByte[1] == 101)
        {
          i = j;
          if (arrayOfByte[2] == 120)
          {
            i = j;
            if (arrayOfByte[3] == 10)
            {
              if (arrayOfByte[7] == 0) {
                break label263;
              }
              i = j;
            }
          }
        }
      }
    }
    while (i != 13)
    {
      throw new j("Unexpected magic: " + Arrays.toString(arrayOfByte));
      label263:
      String str = (char)arrayOfByte[4] + (char)arrayOfByte[5] + (char)arrayOfByte[6];
      if (str.equals("036"))
      {
        i = 14;
      }
      else
      {
        i = j;
        if (str.equals("035")) {
          i = 13;
        }
      }
    }
    paramInputStream.ydx = locale.ycQ.getInt();
    paramInputStream.ycS = locale.Ft(20);
    paramInputStream.fileSize = locale.ycQ.getInt();
    i = locale.ycQ.getInt();
    if (i != 112) {
      throw new j("Unexpected header: 0x" + Integer.toHexString(i));
    }
    i = locale.ycQ.getInt();
    if (i != 305419896) {
      throw new j("Unexpected endian tag: 0x" + Integer.toHexString(i));
    }
    paramInputStream.ydy = locale.ycQ.getInt();
    paramInputStream.ydz = locale.ycQ.getInt();
    paramInputStream.ydl.cNu = locale.ycQ.getInt();
    if (paramInputStream.ydl.cNu == 0) {
      throw new j("Cannot merge dex files that do not contain a map");
    }
    paramInputStream.ydf.size = locale.ycQ.getInt();
    paramInputStream.ydf.cNu = locale.ycQ.getInt();
    paramInputStream.ydg.size = locale.ycQ.getInt();
    paramInputStream.ydg.cNu = locale.ycQ.getInt();
    paramInputStream.ydh.size = locale.ycQ.getInt();
    paramInputStream.ydh.cNu = locale.ycQ.getInt();
    paramInputStream.ydi.size = locale.ycQ.getInt();
    paramInputStream.ydi.cNu = locale.ycQ.getInt();
    paramInputStream.ydj.size = locale.ycQ.getInt();
    paramInputStream.ydj.cNu = locale.ycQ.getInt();
    paramInputStream.ydk.size = locale.ycQ.getInt();
    paramInputStream.ydk.cNu = locale.ycQ.getInt();
    paramInputStream.ydA = locale.ycQ.getInt();
    paramInputStream.ydB = locale.ycQ.getInt();
    paramInputStream.a(Fo(paramInputStream.ydl.cNu));
    paramInputStream.cqy();
  }
  
  public static void eY(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= paramInt2)) {
      throw new IndexOutOfBoundsException("index:" + paramInt1 + ", length=" + paramInt2);
    }
  }
  
  public final e Fo(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.ycQ.capacity())) {
      throw new IllegalArgumentException("position=" + paramInt + " length=" + this.ycQ.capacity());
    }
    ByteBuffer localByteBuffer = this.ycQ.duplicate();
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.position(paramInt);
    localByteBuffer.limit(this.ycQ.capacity());
    return new e("temp-section", localByteBuffer);
  }
  
  public final int Fp(int paramInt)
  {
    eY(paramInt, this.ycI.ydg.size);
    int i = this.ycI.ydg.cNu;
    return this.ycQ.getInt(i + paramInt * 4);
  }
  
  public final e a(t.a parama)
  {
    int i = parama.cNu;
    if ((i < 0) || (i >= this.ycQ.capacity())) {
      throw new IllegalArgumentException("position=" + i + " length=" + this.ycQ.capacity());
    }
    ByteBuffer localByteBuffer = this.ycQ.duplicate();
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.position(i);
    localByteBuffer.limit(i + parama.ydE);
    return new e("section", localByteBuffer);
  }
  
  public final void cpZ()
  {
    Fo(12).write(ne(true));
    e locale = Fo(8);
    Adler32 localAdler32 = new Adler32();
    byte[] arrayOfByte = new byte[' '];
    ByteBuffer localByteBuffer = this.ycQ.duplicate();
    localByteBuffer.limit(localByteBuffer.capacity());
    localByteBuffer.position(12);
    while (localByteBuffer.hasRemaining())
    {
      int i = Math.min(8192, localByteBuffer.remaining());
      localByteBuffer.get(arrayOfByte, 0, i);
      localAdler32.update(arrayOfByte, 0, i);
    }
    locale.writeInt((int)localAdler32.getValue());
  }
  
  public final byte[] ne(boolean paramBoolean)
  {
    if ((this.ycS != null) && (!paramBoolean)) {
      return this.ycS;
    }
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      byte[] arrayOfByte2 = new byte[' '];
      ByteBuffer localByteBuffer = this.ycQ.duplicate();
      localByteBuffer.limit(localByteBuffer.capacity());
      localByteBuffer.position(32);
      while (localByteBuffer.hasRemaining())
      {
        int i = Math.min(8192, localByteBuffer.remaining());
        localByteBuffer.get(arrayOfByte2, 0, i);
        localMessageDigest.update(arrayOfByte2, 0, i);
      }
      arrayOfByte1 = localNoSuchAlgorithmException.digest();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new AssertionError();
    }
    byte[] arrayOfByte1;
    this.ycS = arrayOfByte1;
    return arrayOfByte1;
  }
  
  private final class a
    extends AbstractList<f>
    implements RandomAccess
  {
    private a() {}
    
    public final int size()
    {
      return i.this.ycI.ydk.size;
    }
  }
  
  private final class b
    extends AbstractList<n>
    implements RandomAccess
  {
    private b() {}
    
    public final int size()
    {
      return i.this.ycI.ydi.size;
    }
  }
  
  private final class c
    extends AbstractList<p>
    implements RandomAccess
  {
    private c() {}
    
    public final int size()
    {
      return i.this.ycI.ydj.size;
    }
  }
  
  private final class d
    extends AbstractList<r>
    implements RandomAccess
  {
    private d() {}
    
    public final int size()
    {
      return i.this.ycI.ydh.size;
    }
  }
  
  public final class e
    extends com.tencent.tinker.a.a.a.a
  {
    private final String name;
    
    public e(String paramString, ByteBuffer paramByteBuffer)
    {
      super();
      this.name = paramString;
    }
    
    private void a(t.a parama, boolean paramBoolean)
    {
      if (parama.ydD)
      {
        if (!paramBoolean) {
          break label87;
        }
        super.Fs(((this.ycQ.position() + 3 & 0xFFFFFFFC) - this.ycQ.position()) * 1);
        while ((this.ycQ.position() & 0x3) != 0) {
          this.ycQ.put((byte)0);
        }
        if (this.ycQ.position() > this.ydJ) {
          this.ydJ = this.ycQ.position();
        }
      }
      return;
      label87:
      this.ycQ.position(this.ycQ.position() + 3 & 0xFFFFFFFC);
    }
    
    public final int a(a parama)
    {
      a(i.this.ycI.ydt, true);
      return super.a(parama);
    }
    
    public final int a(b paramb)
    {
      a(i.this.ycI.ydo, true);
      return super.a(paramb);
    }
    
    public final int a(c paramc)
    {
      a(i.this.ycI.ydn, true);
      return super.a(paramc);
    }
    
    public final int a(d paramd)
    {
      a(i.this.ycI.ydv, true);
      return super.a(paramd);
    }
    
    public final int a(e parame)
    {
      a(i.this.ycI.ydp, true);
      return super.a(parame);
    }
    
    public final int a(f paramf)
    {
      a(i.this.ycI.ydk, true);
      return super.a(paramf);
    }
    
    public final int a(g paramg)
    {
      a(i.this.ycI.ydq, true);
      return super.a(paramg);
    }
    
    public final int a(h paramh)
    {
      a(i.this.ycI.yds, true);
      return super.a(paramh);
    }
    
    public final int a(k paramk)
    {
      a(i.this.ycI.ydu, true);
      return super.a(paramk);
    }
    
    public final int a(n paramn)
    {
      a(i.this.ycI.ydi, true);
      return super.a(paramn);
    }
    
    public final int a(p paramp)
    {
      a(i.this.ycI.ydj, true);
      return super.a(paramp);
    }
    
    public final int a(r paramr)
    {
      a(i.this.ycI.ydh, true);
      return super.a(paramr);
    }
    
    public final int a(s params)
    {
      a(i.this.ycI.ydr, true);
      return super.a(params);
    }
    
    public final int a(u paramu)
    {
      a(i.this.ycI.ydm, true);
      return super.a(paramu);
    }
    
    public final s cqa()
    {
      a(i.this.ycI.ydr, false);
      return super.cqa();
    }
    
    public final u cqb()
    {
      a(i.this.ycI.ydm, false);
      return super.cqb();
    }
    
    public final n cqc()
    {
      a(i.this.ycI.ydi, false);
      return super.cqc();
    }
    
    public final p cqd()
    {
      a(i.this.ycI.ydj, false);
      return super.cqd();
    }
    
    public final r cqe()
    {
      a(i.this.ycI.ydh, false);
      return super.cqe();
    }
    
    public final f cqf()
    {
      a(i.this.ycI.ydk, false);
      return super.cqf();
    }
    
    public final g cqg()
    {
      a(i.this.ycI.ydq, false);
      return super.cqg();
    }
    
    public final h cqh()
    {
      a(i.this.ycI.yds, false);
      return super.cqh();
    }
    
    public final e cqi()
    {
      a(i.this.ycI.ydp, false);
      return super.cqi();
    }
    
    public final a cqj()
    {
      a(i.this.ycI.ydt, false);
      return super.cqj();
    }
    
    public final b cqk()
    {
      a(i.this.ycI.ydo, false);
      return super.cqk();
    }
    
    public final c cql()
    {
      a(i.this.ycI.ydn, false);
      return super.cql();
    }
    
    public final d cqm()
    {
      a(i.this.ycI.ydv, false);
      return super.cqm();
    }
    
    public final k cqn()
    {
      a(i.this.ycI.ydu, false);
      return super.cqn();
    }
  }
  
  private final class f
    extends AbstractList<String>
    implements RandomAccess
  {
    private f() {}
    
    public final String qY(int paramInt)
    {
      i.eY(paramInt, i.this.ycI.ydf.size);
      paramInt = i.this.Fo(i.this.ycI.ydf.cNu + paramInt * 4).ycQ.getInt();
      return i.this.Fo(paramInt).cqa().value;
    }
    
    public final int size()
    {
      return i.this.ycI.ydf.size;
    }
  }
  
  private final class g
    extends AbstractList<Integer>
    implements RandomAccess
  {
    private g() {}
    
    public final int size()
    {
      return i.this.ycI.ydg.size;
    }
  }
  
  private final class h
    extends AbstractList<String>
    implements RandomAccess
  {
    private h() {}
    
    public final int size()
    {
      return i.this.ycI.ydg.size;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tinker\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */