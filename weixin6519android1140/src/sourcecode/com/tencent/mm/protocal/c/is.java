package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class is
  extends com.tencent.mm.bm.a
{
  public int jib;
  public im tXK;
  public il tXL;
  public long tXM;
  public ir tXN;
  public iu tXO;
  public iq tXP;
  
  public is()
  {
    GMTrace.i(3742124474368L, 27881);
    GMTrace.o(3742124474368L, 27881);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3742258692096L, 27882);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jib);
      if (this.tXK != null)
      {
        paramVarArgs.fm(2, this.tXK.aYq());
        this.tXK.a(paramVarArgs);
      }
      if (this.tXL != null)
      {
        paramVarArgs.fm(3, this.tXL.aYq());
        this.tXL.a(paramVarArgs);
      }
      paramVarArgs.T(4, this.tXM);
      if (this.tXN != null)
      {
        paramVarArgs.fm(5, this.tXN.aYq());
        this.tXN.a(paramVarArgs);
      }
      if (this.tXO != null)
      {
        paramVarArgs.fm(6, this.tXO.aYq());
        this.tXO.a(paramVarArgs);
      }
      if (this.tXP != null)
      {
        paramVarArgs.fm(7, this.tXP.aYq());
        this.tXP.a(paramVarArgs);
      }
      GMTrace.o(3742258692096L, 27882);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.jib) + 0;
      paramInt = i;
      if (this.tXK != null) {
        paramInt = i + b.a.a.a.fj(2, this.tXK.aYq());
      }
      i = paramInt;
      if (this.tXL != null) {
        i = paramInt + b.a.a.a.fj(3, this.tXL.aYq());
      }
      i += b.a.a.a.S(4, this.tXM);
      paramInt = i;
      if (this.tXN != null) {
        paramInt = i + b.a.a.a.fj(5, this.tXN.aYq());
      }
      i = paramInt;
      if (this.tXO != null) {
        i = paramInt + b.a.a.a.fj(6, this.tXO.aYq());
      }
      paramInt = i;
      if (this.tXP != null) {
        paramInt = i + b.a.a.a.fj(7, this.tXP.aYq());
      }
      GMTrace.o(3742258692096L, 27882);
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
      GMTrace.o(3742258692096L, 27882);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      is localis = (is)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3742258692096L, 27882);
        return -1;
      case 1: 
        localis.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3742258692096L, 27882);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new im();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((im)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localis.tXK = ((im)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3742258692096L, 27882);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new il();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((il)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localis.tXL = ((il)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3742258692096L, 27882);
        return 0;
      case 4: 
        localis.tXM = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3742258692096L, 27882);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ir();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ir)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localis.tXN = ((ir)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3742258692096L, 27882);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localis.tXO = ((iu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3742258692096L, 27882);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new iq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((iq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localis.tXP = ((iq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3742258692096L, 27882);
      return 0;
    }
    GMTrace.o(3742258692096L, 27882);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\is.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */