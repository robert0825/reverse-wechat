package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class btr
  extends com.tencent.mm.bm.a
{
  public String tVH;
  public String ugy;
  public int vcu;
  public int vcv;
  
  public btr()
  {
    GMTrace.i(15001247023104L, 111768);
    GMTrace.o(15001247023104L, 111768);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15001381240832L, 111769);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugy == null) {
        throw new b("Not all required fields were included: Md5");
      }
      if (this.tVH == null) {
        throw new b("Not all required fields were included: DownloadUrl");
      }
      if (this.ugy != null) {
        paramVarArgs.e(1, this.ugy);
      }
      if (this.tVH != null) {
        paramVarArgs.e(2, this.tVH);
      }
      paramVarArgs.fk(3, this.vcu);
      paramVarArgs.fk(4, this.vcv);
      GMTrace.o(15001381240832L, 111769);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ugy == null) {
        break label464;
      }
    }
    label464:
    for (paramInt = b.a.a.b.b.a.f(1, this.ugy) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tVH != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tVH);
      }
      paramInt = b.a.a.a.fh(3, this.vcu);
      int j = b.a.a.a.fh(4, this.vcv);
      GMTrace.o(15001381240832L, 111769);
      return i + paramInt + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.ugy == null) {
          throw new b("Not all required fields were included: Md5");
        }
        if (this.tVH == null) {
          throw new b("Not all required fields were included: DownloadUrl");
        }
        GMTrace.o(15001381240832L, 111769);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        btr localbtr = (btr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15001381240832L, 111769);
          return -1;
        case 1: 
          localbtr.ugy = locala.yqV.readString();
          GMTrace.o(15001381240832L, 111769);
          return 0;
        case 2: 
          localbtr.tVH = locala.yqV.readString();
          GMTrace.o(15001381240832L, 111769);
          return 0;
        case 3: 
          localbtr.vcu = locala.yqV.nj();
          GMTrace.o(15001381240832L, 111769);
          return 0;
        }
        localbtr.vcv = locala.yqV.nj();
        GMTrace.o(15001381240832L, 111769);
        return 0;
      }
      GMTrace.o(15001381240832L, 111769);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\btr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */