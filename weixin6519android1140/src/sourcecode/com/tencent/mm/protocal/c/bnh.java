package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bnh
  extends azh
{
  public azp tQa;
  public azp tSd;
  public String tSi;
  public azp tSj;
  public azq tVh;
  public azp tVi;
  public String ugx;
  public azq uuK;
  
  public bnh()
  {
    GMTrace.i(13337081413632L, 99369);
    GMTrace.o(13337081413632L, 99369);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13337215631360L, 99370);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uuK == null) {
        throw new b("Not all required fields were included: ImgSid");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uuK != null)
      {
        paramVarArgs.fm(2, this.uuK.aYq());
        this.uuK.a(paramVarArgs);
      }
      if (this.tQa != null)
      {
        paramVarArgs.fm(3, this.tQa.aYq());
        this.tQa.a(paramVarArgs);
      }
      if (this.ugx != null) {
        paramVarArgs.e(4, this.ugx);
      }
      if (this.tVh != null)
      {
        paramVarArgs.fm(5, this.tVh.aYq());
        this.tVh.a(paramVarArgs);
      }
      if (this.tSj != null)
      {
        paramVarArgs.fm(6, this.tSj.aYq());
        this.tSj.a(paramVarArgs);
      }
      if (this.tVi != null)
      {
        paramVarArgs.fm(7, this.tVi.aYq());
        this.tVi.a(paramVarArgs);
      }
      if (this.tSi != null) {
        paramVarArgs.e(8, this.tSi);
      }
      if (this.tSd != null)
      {
        paramVarArgs.fm(9, this.tSd.aYq());
        this.tSd.a(paramVarArgs);
      }
      GMTrace.o(13337215631360L, 99370);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uuK != null) {
        paramInt = i + b.a.a.a.fj(2, this.uuK.aYq());
      }
      i = paramInt;
      if (this.tQa != null) {
        i = paramInt + b.a.a.a.fj(3, this.tQa.aYq());
      }
      paramInt = i;
      if (this.ugx != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ugx);
      }
      i = paramInt;
      if (this.tVh != null) {
        i = paramInt + b.a.a.a.fj(5, this.tVh.aYq());
      }
      paramInt = i;
      if (this.tSj != null) {
        paramInt = i + b.a.a.a.fj(6, this.tSj.aYq());
      }
      i = paramInt;
      if (this.tVi != null) {
        i = paramInt + b.a.a.a.fj(7, this.tVi.aYq());
      }
      paramInt = i;
      if (this.tSi != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tSi);
      }
      i = paramInt;
      if (this.tSd != null) {
        i = paramInt + b.a.a.a.fj(9, this.tSd.aYq());
      }
      GMTrace.o(13337215631360L, 99370);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uuK == null) {
        throw new b("Not all required fields were included: ImgSid");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      GMTrace.o(13337215631360L, 99370);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bnh localbnh = (bnh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13337215631360L, 99370);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbnh.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13337215631360L, 99370);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbnh.uuK = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13337215631360L, 99370);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbnh.tQa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13337215631360L, 99370);
        return 0;
      case 4: 
        localbnh.ugx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13337215631360L, 99370);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbnh.tVh = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13337215631360L, 99370);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbnh.tSj = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13337215631360L, 99370);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbnh.tVi = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13337215631360L, 99370);
        return 0;
      case 8: 
        localbnh.tSi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13337215631360L, 99370);
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
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localbnh.tSd = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13337215631360L, 99370);
      return 0;
    }
    GMTrace.o(13337215631360L, 99370);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */