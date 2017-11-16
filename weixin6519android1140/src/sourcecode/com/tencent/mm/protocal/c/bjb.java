package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bjb
  extends com.tencent.mm.bm.a
{
  public String amf;
  public String omh;
  public LinkedList<String> uUn;
  public String value;
  
  public bjb()
  {
    GMTrace.i(15346723454976L, 114342);
    this.uUn = new LinkedList();
    GMTrace.o(15346723454976L, 114342);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15346857672704L, 114343);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.amf == null) {
        throw new b("Not all required fields were included: key");
      }
      if (this.value == null) {
        throw new b("Not all required fields were included: value");
      }
      if (this.amf != null) {
        paramVarArgs.e(1, this.amf);
      }
      if (this.value != null) {
        paramVarArgs.e(2, this.value);
      }
      if (this.omh != null) {
        paramVarArgs.e(3, this.omh);
      }
      paramVarArgs.d(4, 1, this.uUn);
      GMTrace.o(15346857672704L, 114343);
      return 0;
    }
    if (paramInt == 1) {
      if (this.amf == null) {
        break label492;
      }
    }
    label492:
    for (int i = b.a.a.b.b.a.f(1, this.amf) + 0;; i = 0)
    {
      paramInt = i;
      if (this.value != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.value);
      }
      i = paramInt;
      if (this.omh != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.omh);
      }
      paramInt = b.a.a.a.c(4, 1, this.uUn);
      GMTrace.o(15346857672704L, 114343);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.uUn.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.amf == null) {
          throw new b("Not all required fields were included: key");
        }
        if (this.value == null) {
          throw new b("Not all required fields were included: value");
        }
        GMTrace.o(15346857672704L, 114343);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bjb localbjb = (bjb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15346857672704L, 114343);
          return -1;
        case 1: 
          localbjb.amf = locala.yqV.readString();
          GMTrace.o(15346857672704L, 114343);
          return 0;
        case 2: 
          localbjb.value = locala.yqV.readString();
          GMTrace.o(15346857672704L, 114343);
          return 0;
        case 3: 
          localbjb.omh = locala.yqV.readString();
          GMTrace.o(15346857672704L, 114343);
          return 0;
        }
        localbjb.uUn.add(locala.yqV.readString());
        GMTrace.o(15346857672704L, 114343);
        return 0;
      }
      GMTrace.o(15346857672704L, 114343);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */