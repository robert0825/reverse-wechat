package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class gn
  extends ayx
{
  public azp tTt;
  public String tUI;
  public String tUJ;
  public String tUR;
  public int tVc;
  public String tVd;
  public String tVe;
  public String tVf;
  public int tVg;
  public azq tVh;
  public azp tVi;
  public int tVj;
  
  public gn()
  {
    GMTrace.i(3880100298752L, 28909);
    GMTrace.o(3880100298752L, 28909);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3880234516480L, 28910);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tVc);
      if (this.tUR != null) {
        paramVarArgs.e(3, this.tUR);
      }
      if (this.tVd != null) {
        paramVarArgs.e(4, this.tVd);
      }
      if (this.tVe != null) {
        paramVarArgs.e(5, this.tVe);
      }
      if (this.tVf != null) {
        paramVarArgs.e(6, this.tVf);
      }
      paramVarArgs.fk(7, this.tVg);
      if (this.tVh != null)
      {
        paramVarArgs.fm(8, this.tVh.aYq());
        this.tVh.a(paramVarArgs);
      }
      if (this.tVi != null)
      {
        paramVarArgs.fm(9, this.tVi.aYq());
        this.tVi.a(paramVarArgs);
      }
      paramVarArgs.fk(10, this.tVj);
      if (this.tUI != null) {
        paramVarArgs.e(11, this.tUI);
      }
      if (this.tUJ != null) {
        paramVarArgs.e(12, this.tUJ);
      }
      if (this.tTt != null)
      {
        paramVarArgs.fm(13, this.tTt.aYq());
        this.tTt.a(paramVarArgs);
      }
      GMTrace.o(3880234516480L, 28910);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tVc);
      paramInt = i;
      if (this.tUR != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tUR);
      }
      i = paramInt;
      if (this.tVd != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tVd);
      }
      paramInt = i;
      if (this.tVe != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tVe);
      }
      i = paramInt;
      if (this.tVf != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tVf);
      }
      i += b.a.a.a.fh(7, this.tVg);
      paramInt = i;
      if (this.tVh != null) {
        paramInt = i + b.a.a.a.fj(8, this.tVh.aYq());
      }
      i = paramInt;
      if (this.tVi != null) {
        i = paramInt + b.a.a.a.fj(9, this.tVi.aYq());
      }
      i += b.a.a.a.fh(10, this.tVj);
      paramInt = i;
      if (this.tUI != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.tUI);
      }
      i = paramInt;
      if (this.tUJ != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.tUJ);
      }
      paramInt = i;
      if (this.tTt != null) {
        paramInt = i + b.a.a.a.fj(13, this.tTt.aYq());
      }
      GMTrace.o(3880234516480L, 28910);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3880234516480L, 28910);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      gn localgn = (gn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3880234516480L, 28910);
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
          localgn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3880234516480L, 28910);
        return 0;
      case 2: 
        localgn.tVc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3880234516480L, 28910);
        return 0;
      case 3: 
        localgn.tUR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3880234516480L, 28910);
        return 0;
      case 4: 
        localgn.tVd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3880234516480L, 28910);
        return 0;
      case 5: 
        localgn.tVe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3880234516480L, 28910);
        return 0;
      case 6: 
        localgn.tVf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3880234516480L, 28910);
        return 0;
      case 7: 
        localgn.tVg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3880234516480L, 28910);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localgn.tVh = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3880234516480L, 28910);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localgn.tVi = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3880234516480L, 28910);
        return 0;
      case 10: 
        localgn.tVj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3880234516480L, 28910);
        return 0;
      case 11: 
        localgn.tUI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3880234516480L, 28910);
        return 0;
      case 12: 
        localgn.tUJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3880234516480L, 28910);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localgn.tTt = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3880234516480L, 28910);
      return 0;
    }
    GMTrace.o(3880234516480L, 28910);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\gn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */