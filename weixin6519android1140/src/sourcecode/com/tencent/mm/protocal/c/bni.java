package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bni
  extends ayx
{
  public int nFi;
  public String tRS;
  public String uJL;
  public String uJM;
  public int uJN;
  public String uJO;
  public azp uXj;
  public int uXk;
  public int uXl;
  public String uXm;
  
  public bni()
  {
    GMTrace.i(4031363678208L, 30036);
    GMTrace.o(4031363678208L, 30036);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4031497895936L, 30037);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uXj == null) {
        throw new b("Not all required fields were included: Receipt");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uXj != null)
      {
        paramVarArgs.fm(2, this.uXj.aYq());
        this.uXj.a(paramVarArgs);
      }
      if (this.tRS != null) {
        paramVarArgs.e(3, this.tRS);
      }
      paramVarArgs.fk(4, this.uXk);
      paramVarArgs.fk(5, this.nFi);
      if (this.uJL != null) {
        paramVarArgs.e(6, this.uJL);
      }
      if (this.uJM != null) {
        paramVarArgs.e(7, this.uJM);
      }
      if (this.uJO != null) {
        paramVarArgs.e(8, this.uJO);
      }
      paramVarArgs.fk(9, this.uXl);
      if (this.uXm != null) {
        paramVarArgs.e(10, this.uXm);
      }
      paramVarArgs.fk(11, this.uJN);
      GMTrace.o(4031497895936L, 30037);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.uXj != null) {
        paramInt = i + b.a.a.a.fj(2, this.uXj.aYq());
      }
      i = paramInt;
      if (this.tRS != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tRS);
      }
      i = i + b.a.a.a.fh(4, this.uXk) + b.a.a.a.fh(5, this.nFi);
      paramInt = i;
      if (this.uJL != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uJL);
      }
      i = paramInt;
      if (this.uJM != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uJM);
      }
      paramInt = i;
      if (this.uJO != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uJO);
      }
      i = paramInt + b.a.a.a.fh(9, this.uXl);
      paramInt = i;
      if (this.uXm != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.uXm);
      }
      i = b.a.a.a.fh(11, this.uJN);
      GMTrace.o(4031497895936L, 30037);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uXj == null) {
        throw new b("Not all required fields were included: Receipt");
      }
      GMTrace.o(4031497895936L, 30037);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bni localbni = (bni)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4031497895936L, 30037);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbni.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4031497895936L, 30037);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbni.uXj = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4031497895936L, 30037);
        return 0;
      case 3: 
        localbni.tRS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4031497895936L, 30037);
        return 0;
      case 4: 
        localbni.uXk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4031497895936L, 30037);
        return 0;
      case 5: 
        localbni.nFi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4031497895936L, 30037);
        return 0;
      case 6: 
        localbni.uJL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4031497895936L, 30037);
        return 0;
      case 7: 
        localbni.uJM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4031497895936L, 30037);
        return 0;
      case 8: 
        localbni.uJO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4031497895936L, 30037);
        return 0;
      case 9: 
        localbni.uXl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4031497895936L, 30037);
        return 0;
      case 10: 
        localbni.uXm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4031497895936L, 30037);
        return 0;
      }
      localbni.uJN = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4031497895936L, 30037);
      return 0;
    }
    GMTrace.o(4031497895936L, 30037);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */