package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class blk
  extends com.tencent.mm.bm.a
{
  public int tRC;
  public int tRD;
  public com.tencent.mm.bm.b uVz;
  public String ugH;
  
  public blk()
  {
    GMTrace.i(3932042559488L, 29296);
    GMTrace.o(3932042559488L, 29296);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3932176777216L, 29297);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uVz == null) {
        throw new b.a.a.b("Not all required fields were included: EmojiBuffer");
      }
      if (this.ugH != null) {
        paramVarArgs.e(1, this.ugH);
      }
      paramVarArgs.fk(2, this.tRD);
      paramVarArgs.fk(3, this.tRC);
      if (this.uVz != null) {
        paramVarArgs.b(4, this.uVz);
      }
      GMTrace.o(3932176777216L, 29297);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ugH == null) {
        break label431;
      }
    }
    label431:
    for (paramInt = b.a.a.b.b.a.f(1, this.ugH) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.tRD) + b.a.a.a.fh(3, this.tRC);
      paramInt = i;
      if (this.uVz != null) {
        paramInt = i + b.a.a.a.a(4, this.uVz);
      }
      GMTrace.o(3932176777216L, 29297);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.uVz == null) {
          throw new b.a.a.b("Not all required fields were included: EmojiBuffer");
        }
        GMTrace.o(3932176777216L, 29297);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        blk localblk = (blk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3932176777216L, 29297);
          return -1;
        case 1: 
          localblk.ugH = locala.yqV.readString();
          GMTrace.o(3932176777216L, 29297);
          return 0;
        case 2: 
          localblk.tRD = locala.yqV.nj();
          GMTrace.o(3932176777216L, 29297);
          return 0;
        case 3: 
          localblk.tRC = locala.yqV.nj();
          GMTrace.o(3932176777216L, 29297);
          return 0;
        }
        localblk.uVz = locala.csV();
        GMTrace.o(3932176777216L, 29297);
        return 0;
      }
      GMTrace.o(3932176777216L, 29297);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\blk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */