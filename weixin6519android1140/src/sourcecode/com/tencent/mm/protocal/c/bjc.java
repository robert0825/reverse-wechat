package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bjc
  extends com.tencent.mm.bm.a
{
  public String eCh;
  public String ero;
  public String mcV;
  public String mhI;
  public String mhK;
  public String mhL;
  public String mhM;
  public String title;
  public String uUo;
  public int uUp;
  public String uUq;
  public int versionCode;
  
  public bjc()
  {
    GMTrace.i(19138642706432L, 142594);
    GMTrace.o(19138642706432L, 142594);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19138776924160L, 142595);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mhK == null) {
        throw new b("Not all required fields were included: patchId");
      }
      if (this.mhL == null) {
        throw new b("Not all required fields were included: newApkMd5");
      }
      if (this.mhM == null) {
        throw new b("Not all required fields were included: oldApkMd5");
      }
      if (this.title == null) {
        throw new b("Not all required fields were included: title");
      }
      if (this.uUq == null) {
        throw new b("Not all required fields were included: okBtn");
      }
      if (this.mcV == null) {
        throw new b("Not all required fields were included: cancelBtn");
      }
      if (this.ero == null) {
        throw new b("Not all required fields were included: patchMd5");
      }
      if (this.mhK != null) {
        paramVarArgs.e(1, this.mhK);
      }
      if (this.uUo != null) {
        paramVarArgs.e(2, this.uUo);
      }
      paramVarArgs.fk(3, this.uUp);
      if (this.mhL != null) {
        paramVarArgs.e(4, this.mhL);
      }
      if (this.mhM != null) {
        paramVarArgs.e(5, this.mhM);
      }
      if (this.title != null) {
        paramVarArgs.e(6, this.title);
      }
      if (this.eCh != null) {
        paramVarArgs.e(7, this.eCh);
      }
      if (this.uUq != null) {
        paramVarArgs.e(8, this.uUq);
      }
      if (this.mcV != null) {
        paramVarArgs.e(9, this.mcV);
      }
      if (this.mhI != null) {
        paramVarArgs.e(10, this.mhI);
      }
      if (this.ero != null) {
        paramVarArgs.e(11, this.ero);
      }
      paramVarArgs.fk(12, this.versionCode);
      GMTrace.o(19138776924160L, 142595);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mhK == null) {
        break label1148;
      }
    }
    label1148:
    for (paramInt = b.a.a.b.b.a.f(1, this.mhK) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uUo != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uUo);
      }
      i += b.a.a.a.fh(3, this.uUp);
      paramInt = i;
      if (this.mhL != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mhL);
      }
      i = paramInt;
      if (this.mhM != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mhM);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.title);
      }
      i = paramInt;
      if (this.eCh != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.eCh);
      }
      paramInt = i;
      if (this.uUq != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uUq);
      }
      i = paramInt;
      if (this.mcV != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.mcV);
      }
      paramInt = i;
      if (this.mhI != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.mhI);
      }
      i = paramInt;
      if (this.ero != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.ero);
      }
      paramInt = b.a.a.a.fh(12, this.versionCode);
      GMTrace.o(19138776924160L, 142595);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.mhK == null) {
          throw new b("Not all required fields were included: patchId");
        }
        if (this.mhL == null) {
          throw new b("Not all required fields were included: newApkMd5");
        }
        if (this.mhM == null) {
          throw new b("Not all required fields were included: oldApkMd5");
        }
        if (this.title == null) {
          throw new b("Not all required fields were included: title");
        }
        if (this.uUq == null) {
          throw new b("Not all required fields were included: okBtn");
        }
        if (this.mcV == null) {
          throw new b("Not all required fields were included: cancelBtn");
        }
        if (this.ero == null) {
          throw new b("Not all required fields were included: patchMd5");
        }
        GMTrace.o(19138776924160L, 142595);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bjc localbjc = (bjc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(19138776924160L, 142595);
          return -1;
        case 1: 
          localbjc.mhK = locala.yqV.readString();
          GMTrace.o(19138776924160L, 142595);
          return 0;
        case 2: 
          localbjc.uUo = locala.yqV.readString();
          GMTrace.o(19138776924160L, 142595);
          return 0;
        case 3: 
          localbjc.uUp = locala.yqV.nj();
          GMTrace.o(19138776924160L, 142595);
          return 0;
        case 4: 
          localbjc.mhL = locala.yqV.readString();
          GMTrace.o(19138776924160L, 142595);
          return 0;
        case 5: 
          localbjc.mhM = locala.yqV.readString();
          GMTrace.o(19138776924160L, 142595);
          return 0;
        case 6: 
          localbjc.title = locala.yqV.readString();
          GMTrace.o(19138776924160L, 142595);
          return 0;
        case 7: 
          localbjc.eCh = locala.yqV.readString();
          GMTrace.o(19138776924160L, 142595);
          return 0;
        case 8: 
          localbjc.uUq = locala.yqV.readString();
          GMTrace.o(19138776924160L, 142595);
          return 0;
        case 9: 
          localbjc.mcV = locala.yqV.readString();
          GMTrace.o(19138776924160L, 142595);
          return 0;
        case 10: 
          localbjc.mhI = locala.yqV.readString();
          GMTrace.o(19138776924160L, 142595);
          return 0;
        case 11: 
          localbjc.ero = locala.yqV.readString();
          GMTrace.o(19138776924160L, 142595);
          return 0;
        }
        localbjc.versionCode = locala.yqV.nj();
        GMTrace.o(19138776924160L, 142595);
        return 0;
      }
      GMTrace.o(19138776924160L, 142595);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bjc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */