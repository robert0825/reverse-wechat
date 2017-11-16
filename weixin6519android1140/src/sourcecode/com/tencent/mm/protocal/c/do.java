package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class do
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPi;
  public String tRO;
  public String tRP;
  public dp tRQ;
  
  public do()
  {
    GMTrace.i(3702396026880L, 27585);
    GMTrace.o(3702396026880L, 27585);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3702530244608L, 27586);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRQ == null) {
        throw new b("Not all required fields were included: ArtisIcon");
      }
      if (this.lPi != null) {
        paramVarArgs.e(1, this.lPi);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      if (this.tRO != null) {
        paramVarArgs.e(3, this.tRO);
      }
      if (this.tRP != null) {
        paramVarArgs.e(4, this.tRP);
      }
      if (this.tRQ != null)
      {
        paramVarArgs.fm(5, this.tRQ.aYq());
        this.tRQ.a(paramVarArgs);
      }
      GMTrace.o(3702530244608L, 27586);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lPi != null) {
        i = b.a.a.b.b.a.f(1, this.lPi) + 0;
      }
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eBt);
      }
      i = paramInt;
      if (this.tRO != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tRO);
      }
      paramInt = i;
      if (this.tRP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tRP);
      }
      i = paramInt;
      if (this.tRQ != null) {
        i = paramInt + b.a.a.a.fj(5, this.tRQ.aYq());
      }
      GMTrace.o(3702530244608L, 27586);
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
      if (this.tRQ == null) {
        throw new b("Not all required fields were included: ArtisIcon");
      }
      GMTrace.o(3702530244608L, 27586);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      do localdo = (do)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3702530244608L, 27586);
        return -1;
      case 1: 
        localdo.lPi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3702530244608L, 27586);
        return 0;
      case 2: 
        localdo.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3702530244608L, 27586);
        return 0;
      case 3: 
        localdo.tRO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3702530244608L, 27586);
        return 0;
      case 4: 
        localdo.tRP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3702530244608L, 27586);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new dp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((dp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localdo.tRQ = ((dp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3702530244608L, 27586);
      return 0;
    }
    GMTrace.o(3702530244608L, 27586);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */