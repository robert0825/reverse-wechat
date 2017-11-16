package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aza
  extends com.tencent.mm.bm.a
{
  public int tYf;
  public int tqo;
  public int uJY;
  public azd uNn;
  public azc uNo;
  public int uNp;
  public String uNq;
  public int uNr;
  public int uNs;
  public int uNt;
  public int urq;
  public int uxd;
  
  public aza()
  {
    GMTrace.i(3940900929536L, 29362);
    GMTrace.o(3940900929536L, 29362);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3941035147264L, 29363);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNq == null) {
        throw new b("Not all required fields were included: SampleId");
      }
      paramVarArgs.fk(1, this.uJY);
      if (this.uNn != null)
      {
        paramVarArgs.fm(2, this.uNn.aYq());
        this.uNn.a(paramVarArgs);
      }
      if (this.uNo != null)
      {
        paramVarArgs.fm(3, this.uNo.aYq());
        this.uNo.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.urq);
      paramVarArgs.fk(5, this.uNp);
      if (this.uNq != null) {
        paramVarArgs.e(6, this.uNq);
      }
      paramVarArgs.fk(7, this.tYf);
      paramVarArgs.fk(8, this.uNr);
      paramVarArgs.fk(9, this.tqo);
      paramVarArgs.fk(10, this.uNs);
      paramVarArgs.fk(11, this.uNt);
      paramVarArgs.fk(12, this.uxd);
      GMTrace.o(3941035147264L, 29363);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uJY) + 0;
      paramInt = i;
      if (this.uNn != null) {
        paramInt = i + b.a.a.a.fj(2, this.uNn.aYq());
      }
      i = paramInt;
      if (this.uNo != null) {
        i = paramInt + b.a.a.a.fj(3, this.uNo.aYq());
      }
      i = i + b.a.a.a.fh(4, this.urq) + b.a.a.a.fh(5, this.uNp);
      paramInt = i;
      if (this.uNq != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uNq);
      }
      i = b.a.a.a.fh(7, this.tYf);
      int j = b.a.a.a.fh(8, this.uNr);
      int k = b.a.a.a.fh(9, this.tqo);
      int m = b.a.a.a.fh(10, this.uNs);
      int n = b.a.a.a.fh(11, this.uNt);
      int i1 = b.a.a.a.fh(12, this.uxd);
      GMTrace.o(3941035147264L, 29363);
      return paramInt + i + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uNq == null) {
        throw new b("Not all required fields were included: SampleId");
      }
      GMTrace.o(3941035147264L, 29363);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aza localaza = (aza)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3941035147264L, 29363);
        return -1;
      case 1: 
        localaza.uJY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3941035147264L, 29363);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaza.uNn = ((azd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3941035147264L, 29363);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaza.uNo = ((azc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3941035147264L, 29363);
        return 0;
      case 4: 
        localaza.urq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3941035147264L, 29363);
        return 0;
      case 5: 
        localaza.uNp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3941035147264L, 29363);
        return 0;
      case 6: 
        localaza.uNq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3941035147264L, 29363);
        return 0;
      case 7: 
        localaza.tYf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3941035147264L, 29363);
        return 0;
      case 8: 
        localaza.uNr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3941035147264L, 29363);
        return 0;
      case 9: 
        localaza.tqo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3941035147264L, 29363);
        return 0;
      case 10: 
        localaza.uNs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3941035147264L, 29363);
        return 0;
      case 11: 
        localaza.uNt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3941035147264L, 29363);
        return 0;
      }
      localaza.uxd = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3941035147264L, 29363);
      return 0;
    }
    GMTrace.o(3941035147264L, 29363);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */