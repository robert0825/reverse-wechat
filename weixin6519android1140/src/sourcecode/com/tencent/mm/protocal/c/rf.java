package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class rf
  extends com.tencent.mm.bm.a
{
  public String lSG;
  public String uhB;
  public String uhC;
  public String uhD;
  
  public rf()
  {
    GMTrace.i(3934190043136L, 29312);
    GMTrace.o(3934190043136L, 29312);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3934324260864L, 29313);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lSG == null) {
        throw new b("Not all required fields were included: Label");
      }
      if (this.uhB == null) {
        throw new b("Not all required fields were included: Number");
      }
      if (this.uhC == null) {
        throw new b("Not all required fields were included: Type");
      }
      if (this.lSG != null) {
        paramVarArgs.e(1, this.lSG);
      }
      if (this.uhB != null) {
        paramVarArgs.e(2, this.uhB);
      }
      if (this.uhC != null) {
        paramVarArgs.e(3, this.uhC);
      }
      if (this.uhD != null) {
        paramVarArgs.e(4, this.uhD);
      }
      GMTrace.o(3934324260864L, 29313);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lSG == null) {
        break label538;
      }
    }
    label538:
    for (int i = b.a.a.b.b.a.f(1, this.lSG) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uhB != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uhB);
      }
      i = paramInt;
      if (this.uhC != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uhC);
      }
      paramInt = i;
      if (this.uhD != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uhD);
      }
      GMTrace.o(3934324260864L, 29313);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.lSG == null) {
          throw new b("Not all required fields were included: Label");
        }
        if (this.uhB == null) {
          throw new b("Not all required fields were included: Number");
        }
        if (this.uhC == null) {
          throw new b("Not all required fields were included: Type");
        }
        GMTrace.o(3934324260864L, 29313);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        rf localrf = (rf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3934324260864L, 29313);
          return -1;
        case 1: 
          localrf.lSG = locala.yqV.readString();
          GMTrace.o(3934324260864L, 29313);
          return 0;
        case 2: 
          localrf.uhB = locala.yqV.readString();
          GMTrace.o(3934324260864L, 29313);
          return 0;
        case 3: 
          localrf.uhC = locala.yqV.readString();
          GMTrace.o(3934324260864L, 29313);
          return 0;
        }
        localrf.uhD = locala.yqV.readString();
        GMTrace.o(3934324260864L, 29313);
        return 0;
      }
      GMTrace.o(3934324260864L, 29313);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\rf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */