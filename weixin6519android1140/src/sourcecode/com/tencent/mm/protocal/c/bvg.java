package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bvg
  extends com.tencent.mm.bm.a
{
  public String eSd;
  public int type;
  public String vdA;
  public int vdB;
  public int vdC;
  public String vdz;
  
  public bvg()
  {
    GMTrace.i(4029484630016L, 30022);
    GMTrace.o(4029484630016L, 30022);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4029618847744L, 30023);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.type);
      if (this.eSd != null) {
        paramVarArgs.e(2, this.eSd);
      }
      if (this.vdz != null) {
        paramVarArgs.e(3, this.vdz);
      }
      if (this.vdA != null) {
        paramVarArgs.e(4, this.vdA);
      }
      paramVarArgs.fk(5, this.vdB);
      paramVarArgs.fk(6, this.vdC);
      GMTrace.o(4029618847744L, 30023);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.type) + 0;
      paramInt = i;
      if (this.eSd != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eSd);
      }
      i = paramInt;
      if (this.vdz != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.vdz);
      }
      paramInt = i;
      if (this.vdA != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.vdA);
      }
      i = b.a.a.a.fh(5, this.vdB);
      int j = b.a.a.a.fh(6, this.vdC);
      GMTrace.o(4029618847744L, 30023);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4029618847744L, 30023);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bvg localbvg = (bvg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4029618847744L, 30023);
        return -1;
      case 1: 
        localbvg.type = locala.yqV.nj();
        GMTrace.o(4029618847744L, 30023);
        return 0;
      case 2: 
        localbvg.eSd = locala.yqV.readString();
        GMTrace.o(4029618847744L, 30023);
        return 0;
      case 3: 
        localbvg.vdz = locala.yqV.readString();
        GMTrace.o(4029618847744L, 30023);
        return 0;
      case 4: 
        localbvg.vdA = locala.yqV.readString();
        GMTrace.o(4029618847744L, 30023);
        return 0;
      case 5: 
        localbvg.vdB = locala.yqV.nj();
        GMTrace.o(4029618847744L, 30023);
        return 0;
      }
      localbvg.vdC = locala.yqV.nj();
      GMTrace.o(4029618847744L, 30023);
      return 0;
    }
    GMTrace.o(4029618847744L, 30023);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bvg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */