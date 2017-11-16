package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bv
  extends com.tencent.mm.bm.a
{
  public int lQc;
  public int nFd;
  public long tQd;
  public int tQe;
  public azq tQf;
  public int tQg;
  public azq tQh;
  public int tQi;
  
  public bv()
  {
    GMTrace.i(13586323734528L, 101226);
    GMTrace.o(13586323734528L, 101226);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13586457952256L, 101227);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tQf == null) {
        throw new b("Not all required fields were included: ChatRoomId");
      }
      if (this.tQh == null) {
        throw new b("Not all required fields were included: DigestContent");
      }
      if (this.tQf != null)
      {
        paramVarArgs.fm(1, this.tQf.aYq());
        this.tQf.a(paramVarArgs);
      }
      paramVarArgs.T(2, this.tQd);
      paramVarArgs.fk(3, this.tQe);
      paramVarArgs.fk(4, this.nFd);
      paramVarArgs.fk(5, this.tQg);
      if (this.tQh != null)
      {
        paramVarArgs.fm(6, this.tQh.aYq());
        this.tQh.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.tQi);
      paramVarArgs.fk(8, this.lQc);
      GMTrace.o(13586457952256L, 101227);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tQf != null) {
        paramInt = b.a.a.a.fj(1, this.tQf.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.S(2, this.tQd) + b.a.a.a.fh(3, this.tQe) + b.a.a.a.fh(4, this.nFd) + b.a.a.a.fh(5, this.tQg);
      paramInt = i;
      if (this.tQh != null) {
        paramInt = i + b.a.a.a.fj(6, this.tQh.aYq());
      }
      i = b.a.a.a.fh(7, this.tQi);
      int j = b.a.a.a.fh(8, this.lQc);
      GMTrace.o(13586457952256L, 101227);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tQf == null) {
        throw new b("Not all required fields were included: ChatRoomId");
      }
      if (this.tQh == null) {
        throw new b("Not all required fields were included: DigestContent");
      }
      GMTrace.o(13586457952256L, 101227);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bv localbv = (bv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13586457952256L, 101227);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbv.tQf = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13586457952256L, 101227);
        return 0;
      case 2: 
        localbv.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(13586457952256L, 101227);
        return 0;
      case 3: 
        localbv.tQe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13586457952256L, 101227);
        return 0;
      case 4: 
        localbv.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13586457952256L, 101227);
        return 0;
      case 5: 
        localbv.tQg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13586457952256L, 101227);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbv.tQh = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13586457952256L, 101227);
        return 0;
      case 7: 
        localbv.tQi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13586457952256L, 101227);
        return 0;
      }
      localbv.lQc = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13586457952256L, 101227);
      return 0;
    }
    GMTrace.o(13586457952256L, 101227);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */