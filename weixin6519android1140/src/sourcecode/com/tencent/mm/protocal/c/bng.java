package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bng
  extends ayx
{
  public int tMX;
  public azp tTt;
  public String tVd;
  public azq tVh;
  public azp tVi;
  public int uPl;
  public String uXh;
  public azq uXi;
  public azq uuK;
  
  public bng()
  {
    GMTrace.i(13342450122752L, 99409);
    GMTrace.o(13342450122752L, 99409);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13342584340480L, 99410);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tMX);
      if (this.uXh != null) {
        paramVarArgs.e(3, this.uXh);
      }
      if (this.tVd != null) {
        paramVarArgs.e(4, this.tVd);
      }
      if (this.uuK != null)
      {
        paramVarArgs.fm(5, this.uuK.aYq());
        this.uuK.a(paramVarArgs);
      }
      if (this.uXi != null)
      {
        paramVarArgs.fm(6, this.uXi.aYq());
        this.uXi.a(paramVarArgs);
      }
      if (this.tVh != null)
      {
        paramVarArgs.fm(7, this.tVh.aYq());
        this.tVh.a(paramVarArgs);
      }
      if (this.tVi != null)
      {
        paramVarArgs.fm(8, this.tVi.aYq());
        this.tVi.a(paramVarArgs);
      }
      paramVarArgs.fk(9, this.uPl);
      if (this.tTt != null)
      {
        paramVarArgs.fm(10, this.tTt.aYq());
        this.tTt.a(paramVarArgs);
      }
      GMTrace.o(13342584340480L, 99410);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tMX);
      paramInt = i;
      if (this.uXh != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uXh);
      }
      i = paramInt;
      if (this.tVd != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tVd);
      }
      paramInt = i;
      if (this.uuK != null) {
        paramInt = i + b.a.a.a.fj(5, this.uuK.aYq());
      }
      i = paramInt;
      if (this.uXi != null) {
        i = paramInt + b.a.a.a.fj(6, this.uXi.aYq());
      }
      paramInt = i;
      if (this.tVh != null) {
        paramInt = i + b.a.a.a.fj(7, this.tVh.aYq());
      }
      i = paramInt;
      if (this.tVi != null) {
        i = paramInt + b.a.a.a.fj(8, this.tVi.aYq());
      }
      i += b.a.a.a.fh(9, this.uPl);
      paramInt = i;
      if (this.tTt != null) {
        paramInt = i + b.a.a.a.fj(10, this.tTt.aYq());
      }
      GMTrace.o(13342584340480L, 99410);
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
      GMTrace.o(13342584340480L, 99410);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bng localbng = (bng)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13342584340480L, 99410);
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
          localbng.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342584340480L, 99410);
        return 0;
      case 2: 
        localbng.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342584340480L, 99410);
        return 0;
      case 3: 
        localbng.uXh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342584340480L, 99410);
        return 0;
      case 4: 
        localbng.tVd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342584340480L, 99410);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbng.uuK = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342584340480L, 99410);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbng.uXi = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342584340480L, 99410);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbng.tVh = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342584340480L, 99410);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbng.tVi = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342584340480L, 99410);
        return 0;
      case 9: 
        localbng.uPl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342584340480L, 99410);
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
        localbng.tTt = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13342584340480L, 99410);
      return 0;
    }
    GMTrace.o(13342584340480L, 99410);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */