package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class aoc
  extends com.tencent.mm.bm.a
{
  public String eLQ;
  public int type;
  public String uEa;
  public String uEb;
  public String uEc;
  public int uEd;
  public String url;
  
  public aoc()
  {
    GMTrace.i(17872164225024L, 133158);
    GMTrace.o(17872164225024L, 133158);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17872298442752L, 133159);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eLQ == null) {
        throw new b("Not all required fields were included: wording");
      }
      paramVarArgs.fk(1, this.type);
      if (this.eLQ != null) {
        paramVarArgs.e(2, this.eLQ);
      }
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      if (this.uEa != null) {
        paramVarArgs.e(4, this.uEa);
      }
      if (this.uEb != null) {
        paramVarArgs.e(5, this.uEb);
      }
      if (this.uEc != null) {
        paramVarArgs.e(7, this.uEc);
      }
      paramVarArgs.fk(8, this.uEd);
      GMTrace.o(17872298442752L, 133159);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.type) + 0;
      paramInt = i;
      if (this.eLQ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eLQ);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.url);
      }
      paramInt = i;
      if (this.uEa != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uEa);
      }
      i = paramInt;
      if (this.uEb != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uEb);
      }
      paramInt = i;
      if (this.uEc != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uEc);
      }
      i = b.a.a.a.fh(8, this.uEd);
      GMTrace.o(17872298442752L, 133159);
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
      if (this.eLQ == null) {
        throw new b("Not all required fields were included: wording");
      }
      GMTrace.o(17872298442752L, 133159);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aoc localaoc = (aoc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      case 6: 
      default: 
        GMTrace.o(17872298442752L, 133159);
        return -1;
      case 1: 
        localaoc.type = locala.yqV.nj();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      case 2: 
        localaoc.eLQ = locala.yqV.readString();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      case 3: 
        localaoc.url = locala.yqV.readString();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      case 4: 
        localaoc.uEa = locala.yqV.readString();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      case 5: 
        localaoc.uEb = locala.yqV.readString();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      case 7: 
        localaoc.uEc = locala.yqV.readString();
        GMTrace.o(17872298442752L, 133159);
        return 0;
      }
      localaoc.uEd = locala.yqV.nj();
      GMTrace.o(17872298442752L, 133159);
      return 0;
    }
    GMTrace.o(17872298442752L, 133159);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aoc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */