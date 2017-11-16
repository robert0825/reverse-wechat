package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ls
  extends ayx
{
  public String lPg;
  public String lSX;
  public String lTj;
  public int tOG;
  public int tQP;
  public int ucq;
  public LinkedList<azq> ucr;
  public String ucs;
  public String uct;
  
  public ls()
  {
    GMTrace.i(3846277431296L, 28657);
    this.ucr = new LinkedList();
    GMTrace.o(3846277431296L, 28657);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3846411649024L, 28658);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tQP);
      if (this.lSX != null) {
        paramVarArgs.e(3, this.lSX);
      }
      if (this.lTj != null) {
        paramVarArgs.e(4, this.lTj);
      }
      if (this.lPg != null) {
        paramVarArgs.e(5, this.lPg);
      }
      paramVarArgs.fk(6, this.ucq);
      paramVarArgs.d(7, 8, this.ucr);
      if (this.ucs != null) {
        paramVarArgs.e(8, this.ucs);
      }
      if (this.uct != null) {
        paramVarArgs.e(9, this.uct);
      }
      paramVarArgs.fk(10, this.tOG);
      GMTrace.o(3846411649024L, 28658);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tQP);
      paramInt = i;
      if (this.lSX != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lSX);
      }
      i = paramInt;
      if (this.lTj != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.lTj);
      }
      paramInt = i;
      if (this.lPg != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.lPg);
      }
      i = paramInt + b.a.a.a.fh(6, this.ucq) + b.a.a.a.c(7, 8, this.ucr);
      paramInt = i;
      if (this.ucs != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ucs);
      }
      i = paramInt;
      if (this.uct != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.uct);
      }
      paramInt = b.a.a.a.fh(10, this.tOG);
      GMTrace.o(3846411649024L, 28658);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ucr.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3846411649024L, 28658);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ls localls = (ls)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3846411649024L, 28658);
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
          localls.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3846411649024L, 28658);
        return 0;
      case 2: 
        localls.tQP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3846411649024L, 28658);
        return 0;
      case 3: 
        localls.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3846411649024L, 28658);
        return 0;
      case 4: 
        localls.lTj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3846411649024L, 28658);
        return 0;
      case 5: 
        localls.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3846411649024L, 28658);
        return 0;
      case 6: 
        localls.ucq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3846411649024L, 28658);
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
          localls.ucr.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3846411649024L, 28658);
        return 0;
      case 8: 
        localls.ucs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3846411649024L, 28658);
        return 0;
      case 9: 
        localls.uct = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3846411649024L, 28658);
        return 0;
      }
      localls.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3846411649024L, 28658);
      return 0;
    }
    GMTrace.o(3846411649024L, 28658);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\protocal\c\ls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */