package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class im
  extends com.tencent.mm.bm.a
{
  public String jio;
  public String lPE;
  public io tXp;
  public bbc tXs;
  public it tXt;
  
  public im()
  {
    GMTrace.i(3719039025152L, 27709);
    GMTrace.o(3719039025152L, 27709);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3719173242880L, 27710);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jio == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.tXs == null) {
        throw new b("Not all required fields were included: ContactItem");
      }
      if (this.jio != null) {
        paramVarArgs.e(1, this.jio);
      }
      if (this.tXp != null)
      {
        paramVarArgs.fm(2, this.tXp.aYq());
        this.tXp.a(paramVarArgs);
      }
      if (this.tXs != null)
      {
        paramVarArgs.fm(3, this.tXs.aYq());
        this.tXs.a(paramVarArgs);
      }
      if (this.tXt != null)
      {
        paramVarArgs.fm(4, this.tXt.aYq());
        this.tXt.a(paramVarArgs);
      }
      if (this.lPE != null) {
        paramVarArgs.e(5, this.lPE);
      }
      GMTrace.o(3719173242880L, 27710);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.jio != null) {
        i = b.a.a.b.b.a.f(1, this.jio) + 0;
      }
      paramInt = i;
      if (this.tXp != null) {
        paramInt = i + b.a.a.a.fj(2, this.tXp.aYq());
      }
      i = paramInt;
      if (this.tXs != null) {
        i = paramInt + b.a.a.a.fj(3, this.tXs.aYq());
      }
      paramInt = i;
      if (this.tXt != null) {
        paramInt = i + b.a.a.a.fj(4, this.tXt.aYq());
      }
      i = paramInt;
      if (this.lPE != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lPE);
      }
      GMTrace.o(3719173242880L, 27710);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.jio == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.tXs == null) {
        throw new b("Not all required fields were included: ContactItem");
      }
      GMTrace.o(3719173242880L, 27710);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      im localim = (im)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3719173242880L, 27710);
        return -1;
      case 1: 
        localim.jio = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3719173242880L, 27710);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new io();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((io)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localim.tXp = ((io)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3719173242880L, 27710);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bbc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bbc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localim.tXs = ((bbc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3719173242880L, 27710);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new it();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((it)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localim.tXt = ((it)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3719173242880L, 27710);
        return 0;
      }
      localim.lPE = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3719173242880L, 27710);
      return 0;
    }
    GMTrace.o(3719173242880L, 27710);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\im.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */