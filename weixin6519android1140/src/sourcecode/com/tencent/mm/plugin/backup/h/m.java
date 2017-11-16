package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class m
  extends com.tencent.mm.bm.a
{
  public String jhl;
  public String jhm;
  public String jhn;
  public String jho;
  public String jhp;
  public int jhq;
  public long jhr;
  
  public m()
  {
    GMTrace.i(14832535339008L, 110511);
    GMTrace.o(14832535339008L, 110511);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14832669556736L, 110512);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhl == null) {
        throw new b("Not all required fields were included: DeviceID");
      }
      if (this.jhm == null) {
        throw new b("Not all required fields were included: DeviceName");
      }
      if (this.jhn == null) {
        throw new b("Not all required fields were included: Model");
      }
      if (this.jho == null) {
        throw new b("Not all required fields were included: SystemName");
      }
      if (this.jhp == null) {
        throw new b("Not all required fields were included: SystemVersion");
      }
      if (this.jhl != null) {
        paramVarArgs.e(1, this.jhl);
      }
      if (this.jhm != null) {
        paramVarArgs.e(2, this.jhm);
      }
      if (this.jhn != null) {
        paramVarArgs.e(3, this.jhn);
      }
      if (this.jho != null) {
        paramVarArgs.e(4, this.jho);
      }
      if (this.jhp != null) {
        paramVarArgs.e(5, this.jhp);
      }
      paramVarArgs.fk(6, this.jhq);
      paramVarArgs.T(7, this.jhr);
      GMTrace.o(14832669556736L, 110512);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhl == null) {
        break label757;
      }
    }
    label757:
    for (int i = b.a.a.b.b.a.f(1, this.jhl) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jhm != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhm);
      }
      i = paramInt;
      if (this.jhn != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jhn);
      }
      paramInt = i;
      if (this.jho != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jho);
      }
      i = paramInt;
      if (this.jhp != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jhp);
      }
      paramInt = b.a.a.a.fh(6, this.jhq);
      int j = b.a.a.a.S(7, this.jhr);
      GMTrace.o(14832669556736L, 110512);
      return i + paramInt + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.jhl == null) {
          throw new b("Not all required fields were included: DeviceID");
        }
        if (this.jhm == null) {
          throw new b("Not all required fields were included: DeviceName");
        }
        if (this.jhn == null) {
          throw new b("Not all required fields were included: Model");
        }
        if (this.jho == null) {
          throw new b("Not all required fields were included: SystemName");
        }
        if (this.jhp == null) {
          throw new b("Not all required fields were included: SystemVersion");
        }
        GMTrace.o(14832669556736L, 110512);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        m localm = (m)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14832669556736L, 110512);
          return -1;
        case 1: 
          localm.jhl = locala.yqV.readString();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        case 2: 
          localm.jhm = locala.yqV.readString();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        case 3: 
          localm.jhn = locala.yqV.readString();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        case 4: 
          localm.jho = locala.yqV.readString();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        case 5: 
          localm.jhp = locala.yqV.readString();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        case 6: 
          localm.jhq = locala.yqV.nj();
          GMTrace.o(14832669556736L, 110512);
          return 0;
        }
        localm.jhr = locala.yqV.nk();
        GMTrace.o(14832669556736L, 110512);
        return 0;
      }
      GMTrace.o(14832669556736L, 110512);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */