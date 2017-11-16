package com.tencent.mm.plugin.exdevice.d;

import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.bm.a
{
  public int kAW;
  public String kAX;
  public String kAY;
  
  public a()
  {
    GMTrace.i(10992297705472L, 81899);
    GMTrace.o(10992297705472L, 81899);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10992431923200L, 81900);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.kAW);
      if (this.kAX != null) {
        paramVarArgs.e(2, this.kAX);
      }
      if (this.kAY != null) {
        paramVarArgs.e(3, this.kAY);
      }
      GMTrace.o(10992431923200L, 81900);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.kAW) + 0;
      paramInt = i;
      if (this.kAX != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.kAX);
      }
      i = paramInt;
      if (this.kAY != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.kAY);
      }
      GMTrace.o(10992431923200L, 81900);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(10992431923200L, 81900);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      a locala1 = (a)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(10992431923200L, 81900);
        return -1;
      case 1: 
        locala1.kAW = locala.yqV.nj();
        GMTrace.o(10992431923200L, 81900);
        return 0;
      case 2: 
        locala1.kAX = locala.yqV.readString();
        GMTrace.o(10992431923200L, 81900);
        return 0;
      }
      locala1.kAY = locala.yqV.readString();
      GMTrace.o(10992431923200L, 81900);
      return 0;
    }
    GMTrace.o(10992431923200L, 81900);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */