package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class ve
  extends com.tencent.mm.bm.a
{
  public int bsx;
  public String eBt;
  public String lPj;
  public String lQa;
  public String lRT;
  public String nFH;
  public int unA;
  public String une;
  public int unz;
  
  public ve()
  {
    GMTrace.i(3990427271168L, 29731);
    GMTrace.o(3990427271168L, 29731);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3990561488896L, 29732);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lPj == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.nFH == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.lPj != null) {
        paramVarArgs.e(2, this.lPj);
      }
      if (this.nFH != null) {
        paramVarArgs.e(3, this.nFH);
      }
      if (this.une != null) {
        paramVarArgs.e(4, this.une);
      }
      paramVarArgs.fk(5, this.unz);
      paramVarArgs.fk(6, this.unA);
      if (this.lQa != null) {
        paramVarArgs.e(7, this.lQa);
      }
      paramVarArgs.fk(8, this.bsx);
      if (this.lRT != null) {
        paramVarArgs.e(9, this.lRT);
      }
      GMTrace.o(3990561488896L, 29732);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eBt == null) {
        break label814;
      }
    }
    label814:
    for (int i = b.a.a.b.b.a.f(1, this.eBt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPj);
      }
      i = paramInt;
      if (this.nFH != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nFH);
      }
      paramInt = i;
      if (this.une != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.une);
      }
      i = paramInt + b.a.a.a.fh(5, this.unz) + b.a.a.a.fh(6, this.unA);
      paramInt = i;
      if (this.lQa != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.lQa);
      }
      i = paramInt + b.a.a.a.fh(8, this.bsx);
      paramInt = i;
      if (this.lRT != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.lRT);
      }
      GMTrace.o(3990561488896L, 29732);
      return paramInt;
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
        if (this.lPj == null) {
          throw new b("Not all required fields were included: Desc");
        }
        if (this.nFH == null) {
          throw new b("Not all required fields were included: ThumbUrl");
        }
        GMTrace.o(3990561488896L, 29732);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ve localve = (ve)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3990561488896L, 29732);
          return -1;
        case 1: 
          localve.eBt = locala.yqV.readString();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 2: 
          localve.lPj = locala.yqV.readString();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 3: 
          localve.nFH = locala.yqV.readString();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 4: 
          localve.une = locala.yqV.readString();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 5: 
          localve.unz = locala.yqV.nj();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 6: 
          localve.unA = locala.yqV.nj();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 7: 
          localve.lQa = locala.yqV.readString();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        case 8: 
          localve.bsx = locala.yqV.nj();
          GMTrace.o(3990561488896L, 29732);
          return 0;
        }
        localve.lRT = locala.yqV.readString();
        GMTrace.o(3990561488896L, 29732);
        return 0;
      }
      GMTrace.o(3990561488896L, 29732);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */