package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bss
  extends com.tencent.mm.bm.a
{
  public com.tencent.mm.bm.b tRB;
  public int vbP;
  public long vbw;
  
  public bss()
  {
    GMTrace.i(3967476039680L, 29560);
    GMTrace.o(3967476039680L, 29560);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3967610257408L, 29561);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRB == null) {
        throw new b.a.a.b("Not all required fields were included: VoiceData");
      }
      paramVarArgs.T(1, this.vbw);
      if (this.tRB != null) {
        paramVarArgs.b(2, this.tRB);
      }
      paramVarArgs.fk(3, this.vbP);
      GMTrace.o(3967610257408L, 29561);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.S(1, this.vbw) + 0;
      paramInt = i;
      if (this.tRB != null) {
        paramInt = i + b.a.a.a.a(2, this.tRB);
      }
      i = b.a.a.a.fh(3, this.vbP);
      GMTrace.o(3967610257408L, 29561);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tRB == null) {
        throw new b.a.a.b("Not all required fields were included: VoiceData");
      }
      GMTrace.o(3967610257408L, 29561);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bss localbss = (bss)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3967610257408L, 29561);
        return -1;
      case 1: 
        localbss.vbw = locala.yqV.nk();
        GMTrace.o(3967610257408L, 29561);
        return 0;
      case 2: 
        localbss.tRB = locala.csV();
        GMTrace.o(3967610257408L, 29561);
        return 0;
      }
      localbss.vbP = locala.yqV.nj();
      GMTrace.o(3967610257408L, 29561);
      return 0;
    }
    GMTrace.o(3967610257408L, 29561);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */