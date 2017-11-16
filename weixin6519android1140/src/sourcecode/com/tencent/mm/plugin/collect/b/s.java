package com.tencent.mm.plugin.collect.b;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public class s
  extends com.tencent.mm.bm.a
{
  public String eCU;
  public String eRP;
  public String fMz;
  public double jWS;
  public int jWT;
  public String jWU;
  public int msgType;
  public int scene;
  public int status;
  public String username;
  
  public s()
  {
    GMTrace.i(5400787156992L, 40239);
    GMTrace.o(5400787156992L, 40239);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(5400921374720L, 40240);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.eRP == null) {
        throw new b("Not all required fields were included: transactionId");
      }
      if (this.eCU == null) {
        throw new b("Not all required fields were included: feeType");
      }
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      if (this.eRP != null) {
        paramVarArgs.e(2, this.eRP);
      }
      paramVarArgs.a(3, this.jWS);
      if (this.eCU != null) {
        paramVarArgs.e(4, this.eCU);
      }
      paramVarArgs.fk(5, this.jWT);
      paramVarArgs.fk(6, this.scene);
      paramVarArgs.fk(7, this.status);
      if (this.fMz != null) {
        paramVarArgs.e(8, this.fMz);
      }
      if (this.jWU != null) {
        paramVarArgs.e(9, this.jWU);
      }
      paramVarArgs.fk(10, this.msgType);
      GMTrace.o(5400921374720L, 40240);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label830;
      }
    }
    label830:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.eRP != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eRP);
      }
      i += b.a.a.b.b.a.cK(3) + 8;
      paramInt = i;
      if (this.eCU != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.eCU);
      }
      i = paramInt + b.a.a.a.fh(5, this.jWT) + b.a.a.a.fh(6, this.scene) + b.a.a.a.fh(7, this.status);
      paramInt = i;
      if (this.fMz != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.fMz);
      }
      i = paramInt;
      if (this.jWU != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.jWU);
      }
      paramInt = b.a.a.a.fh(10, this.msgType);
      GMTrace.o(5400921374720L, 40240);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.username == null) {
          throw new b("Not all required fields were included: username");
        }
        if (this.eRP == null) {
          throw new b("Not all required fields were included: transactionId");
        }
        if (this.eCU == null) {
          throw new b("Not all required fields were included: feeType");
        }
        GMTrace.o(5400921374720L, 40240);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        s locals = (s)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(5400921374720L, 40240);
          return -1;
        case 1: 
          locals.username = locala.yqV.readString();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 2: 
          locals.eRP = locala.yqV.readString();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 3: 
          locals.jWS = locala.yqV.readDouble();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 4: 
          locals.eCU = locala.yqV.readString();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 5: 
          locals.jWT = locala.yqV.nj();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 6: 
          locals.scene = locala.yqV.nj();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 7: 
          locals.status = locala.yqV.nj();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 8: 
          locals.fMz = locala.yqV.readString();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        case 9: 
          locals.jWU = locala.yqV.readString();
          GMTrace.o(5400921374720L, 40240);
          return 0;
        }
        locals.msgType = locala.yqV.nj();
        GMTrace.o(5400921374720L, 40240);
        return 0;
      }
      GMTrace.o(5400921374720L, 40240);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */