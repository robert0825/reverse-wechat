package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class aob
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String nFH;
  public int uDY;
  public int uDZ;
  public int und;
  public String une;
  
  public aob()
  {
    GMTrace.i(17877532934144L, 133198);
    GMTrace.o(17877532934144L, 133198);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17877667151872L, 133199);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.nFH == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      paramVarArgs.fk(1, this.uDY);
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      if (this.nFH != null) {
        paramVarArgs.e(3, this.nFH);
      }
      paramVarArgs.fk(4, this.und);
      if (this.une != null) {
        paramVarArgs.e(5, this.une);
      }
      paramVarArgs.fk(6, this.uDZ);
      GMTrace.o(17877667151872L, 133199);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uDY) + 0;
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eBt);
      }
      i = paramInt;
      if (this.nFH != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nFH);
      }
      i += b.a.a.a.fh(4, this.und);
      paramInt = i;
      if (this.une != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.une);
      }
      i = b.a.a.a.fh(6, this.uDZ);
      GMTrace.o(17877667151872L, 133199);
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
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.nFH == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      GMTrace.o(17877667151872L, 133199);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aob localaob = (aob)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(17877667151872L, 133199);
        return -1;
      case 1: 
        localaob.uDY = locala.yqV.nj();
        GMTrace.o(17877667151872L, 133199);
        return 0;
      case 2: 
        localaob.eBt = locala.yqV.readString();
        GMTrace.o(17877667151872L, 133199);
        return 0;
      case 3: 
        localaob.nFH = locala.yqV.readString();
        GMTrace.o(17877667151872L, 133199);
        return 0;
      case 4: 
        localaob.und = locala.yqV.nj();
        GMTrace.o(17877667151872L, 133199);
        return 0;
      case 5: 
        localaob.une = locala.yqV.readString();
        GMTrace.o(17877667151872L, 133199);
        return 0;
      }
      localaob.uDZ = locala.yqV.nj();
      GMTrace.o(17877667151872L, 133199);
      return 0;
    }
    GMTrace.o(17877667151872L, 133199);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */