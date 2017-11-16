package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ep
  extends com.tencent.mm.bm.a
{
  public azp tSg;
  public azp tSh;
  public String tSm;
  public azp tTt;
  public bqp tTu;
  public bub tTv;
  public int tTw;
  
  public ep()
  {
    GMTrace.i(13578807541760L, 101170);
    GMTrace.o(13578807541760L, 101170);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13578941759488L, 101171);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTt != null)
      {
        paramVarArgs.fm(1, this.tTt.aYq());
        this.tTt.a(paramVarArgs);
      }
      if (this.tTu != null)
      {
        paramVarArgs.fm(2, this.tTu.aYq());
        this.tTu.a(paramVarArgs);
      }
      if (this.tTv != null)
      {
        paramVarArgs.fm(3, this.tTv.aYq());
        this.tTv.a(paramVarArgs);
      }
      if (this.tSg != null)
      {
        paramVarArgs.fm(4, this.tSg.aYq());
        this.tSg.a(paramVarArgs);
      }
      if (this.tSh != null)
      {
        paramVarArgs.fm(5, this.tSh.aYq());
        this.tSh.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.tTw);
      if (this.tSm != null) {
        paramVarArgs.e(7, this.tSm);
      }
      GMTrace.o(13578941759488L, 101171);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tTt != null) {
        i = b.a.a.a.fj(1, this.tTt.aYq()) + 0;
      }
      paramInt = i;
      if (this.tTu != null) {
        paramInt = i + b.a.a.a.fj(2, this.tTu.aYq());
      }
      i = paramInt;
      if (this.tTv != null) {
        i = paramInt + b.a.a.a.fj(3, this.tTv.aYq());
      }
      paramInt = i;
      if (this.tSg != null) {
        paramInt = i + b.a.a.a.fj(4, this.tSg.aYq());
      }
      i = paramInt;
      if (this.tSh != null) {
        i = paramInt + b.a.a.a.fj(5, this.tSh.aYq());
      }
      i += b.a.a.a.fh(6, this.tTw);
      paramInt = i;
      if (this.tSm != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tSm);
      }
      GMTrace.o(13578941759488L, 101171);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13578941759488L, 101171);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ep localep = (ep)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13578941759488L, 101171);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localep.tTt = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13578941759488L, 101171);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localep.tTu = ((bqp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13578941759488L, 101171);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bub();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bub)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localep.tTv = ((bub)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13578941759488L, 101171);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localep.tSg = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13578941759488L, 101171);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localep.tSh = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13578941759488L, 101171);
        return 0;
      case 6: 
        localep.tTw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13578941759488L, 101171);
        return 0;
      }
      localep.tSm = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(13578941759488L, 101171);
      return 0;
    }
    GMTrace.o(13578941759488L, 101171);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */