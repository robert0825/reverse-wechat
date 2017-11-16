package b.a.a.a;

import java.util.LinkedList;

public final class a
{
  private final b.a.a.a.a.b unknownTagHandler;
  public final b.a.a.b.a.a yqV;
  public int yqW = 0;
  
  public a(byte[] paramArrayOfByte, b.a.a.a.a.b paramb)
  {
    this.yqV = new b.a.a.b.a.a(paramArrayOfByte, paramArrayOfByte.length);
    this.unknownTagHandler = paramb;
  }
  
  public final LinkedList<byte[]> Gv(int paramInt)
  {
    return this.yqV.Gv(paramInt);
  }
  
  public final int csR()
  {
    return this.yqV.nj();
  }
  
  public final LinkedList<Integer> csS()
  {
    b.a.a.b.a.a locala = this.yqV;
    LinkedList localLinkedList = new LinkedList();
    for (;;)
    {
      if (locala.aCH >= locala.bufferSize) {
        return localLinkedList;
      }
      localLinkedList.add(Integer.valueOf(locala.nj()));
    }
  }
  
  public final String csT()
  {
    return this.yqV.readString();
  }
  
  public final boolean csU()
  {
    return this.yqV.nj() != 0;
  }
  
  public final com.tencent.mm.bm.b csV()
  {
    b.a.a.b.a.a locala = this.yqV;
    int i = locala.nj();
    if ((i < locala.bufferSize - locala.aCH) && (i > 0))
    {
      com.tencent.mm.bm.b localb = com.tencent.mm.bm.b.h(locala.buffer, locala.aCH, i);
      locala.aCH = (i + locala.aCH);
      return localb;
    }
    return com.tencent.mm.bm.b.aX(locala.cG(i));
  }
  
  public final void csW()
  {
    int i = b.a.a.b.a.cN(this.yqW);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("FieldNumber: ").append(b.a.a.b.a.cO(this.yqW)).append(" - ");
    switch (i)
    {
    case 3: 
    case 4: 
    default: 
      return;
    case 5: 
      localStringBuffer.append("float value: ").append(Float.toString(this.yqV.readFloat()));
      return;
    case 1: 
      localStringBuffer.append("double value: ").append(Double.toString(this.yqV.readDouble()));
      return;
    case 2: 
      localStringBuffer.append("Length delimited (String or ByteString) value: ").append(this.yqV.readString());
      return;
    }
    localStringBuffer.append("varint (long, int or boolean) value: ").append(this.yqV.nk());
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\b\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */