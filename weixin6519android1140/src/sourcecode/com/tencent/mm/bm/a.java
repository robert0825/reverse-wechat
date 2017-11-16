package com.tencent.mm.bm;

import com.tencent.gmtrace.GMTrace;
import java.io.OutputStream;

public class a
{
  protected static final int OPCODE_COMPUTESIZE = 1;
  protected static final int OPCODE_PARSEFROM = 2;
  protected static final int OPCODE_POPULATEBUILDERWITHFIELD = 3;
  protected static final int OPCODE_WRITEFIELDS = 0;
  public static b.a.a.a.a.b unknownTagHandler;
  
  static
  {
    GMTrace.i(14026021011456L, 104502);
    unknownTagHandler = new b.a.a.a.a.a();
    GMTrace.o(14026021011456L, 104502);
  }
  
  public a()
  {
    GMTrace.i(14026155229184L, 104503);
    GMTrace.o(14026155229184L, 104503);
  }
  
  public static int a(b.a.a.a.a parama)
  {
    int i = 0;
    GMTrace.i(14026423664640L, 104505);
    b.a.a.b.a.a locala = parama.yqV;
    if ((locala.aCH == locala.bufferSize) && (!locala.nk(false))) {
      locala.aCI = 0;
    }
    for (;;)
    {
      parama.yqW = i;
      i = b.a.a.b.a.cO(parama.yqW);
      GMTrace.o(14026423664640L, 104505);
      return i;
      locala.aCI = locala.nj();
      if (locala.aCI == 0) {
        throw b.a.a.b.a.b.cta();
      }
      i = locala.aCI;
    }
  }
  
  public int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14026692100096L, 104507);
    throw new Error("Cannot use this method");
  }
  
  public void a(b.a.a.c.a parama)
  {
    GMTrace.i(14026826317824L, 104508);
    a(0, new Object[] { parama });
    GMTrace.o(14026826317824L, 104508);
  }
  
  public boolean a(b.a.a.a.a parama, a parama1, int paramInt)
  {
    GMTrace.i(14027228971008L, 104511);
    if (a(3, new Object[] { parama, parama1, Integer.valueOf(paramInt) }) == 0)
    {
      GMTrace.o(14027228971008L, 104511);
      return true;
    }
    GMTrace.o(14027228971008L, 104511);
    return false;
  }
  
  public a aD(byte[] paramArrayOfByte)
  {
    GMTrace.i(14027094753280L, 104510);
    a(2, new Object[] { paramArrayOfByte });
    GMTrace.o(14027094753280L, 104510);
    return this;
  }
  
  public int aYq()
  {
    GMTrace.i(14026960535552L, 104509);
    try
    {
      int i = a(1, new Object[0]);
      GMTrace.o(14026960535552L, 104509);
      return i;
    }
    catch (Exception localException)
    {
      GMTrace.o(14026960535552L, 104509);
    }
    return 0;
  }
  
  public a aYr()
  {
    GMTrace.i(14026557882368L, 104506);
    GMTrace.o(14026557882368L, 104506);
    return this;
  }
  
  public byte[] toByteArray()
  {
    GMTrace.i(14026289446912L, 104504);
    aYr();
    byte[] arrayOfByte = new byte[aYq()];
    b.a.a.c.a locala = new b.a.a.c.a(arrayOfByte);
    a(locala);
    if (locala.gtb != null)
    {
      locala.gtb.write(locala.yrb);
      locala.gtb.flush();
    }
    GMTrace.o(14026289446912L, 104504);
    return arrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bm\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */