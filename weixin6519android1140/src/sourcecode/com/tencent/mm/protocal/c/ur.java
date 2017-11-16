package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ur
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public String jio;
  public String lPG;
  public String lQe;
  public String lTf;
  public int tNb;
  public String tUz;
  public String udh;
  public String umU;
  public String umV;
  
  public ur()
  {
    GMTrace.i(3867483832320L, 28815);
    GMTrace.o(3867483832320L, 28815);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3867618050048L, 28816);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lTf != null) {
        paramVarArgs.e(1, this.lTf);
      }
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      if (this.jhi != null) {
        paramVarArgs.e(3, this.jhi);
      }
      if (this.lQe != null) {
        paramVarArgs.e(4, this.lQe);
      }
      if (this.umU != null) {
        paramVarArgs.e(5, this.umU);
      }
      if (this.umV != null) {
        paramVarArgs.e(6, this.umV);
      }
      if (this.tUz != null) {
        paramVarArgs.e(7, this.tUz);
      }
      if (this.udh != null) {
        paramVarArgs.e(8, this.udh);
      }
      if (this.lPG != null) {
        paramVarArgs.e(9, this.lPG);
      }
      paramVarArgs.fk(10, this.tNb);
      GMTrace.o(3867618050048L, 28816);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lTf == null) {
        break label814;
      }
    }
    label814:
    for (int i = b.a.a.b.b.a.f(1, this.lTf) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jio);
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jhi);
      }
      paramInt = i;
      if (this.lQe != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lQe);
      }
      i = paramInt;
      if (this.umU != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.umU);
      }
      paramInt = i;
      if (this.umV != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.umV);
      }
      i = paramInt;
      if (this.tUz != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tUz);
      }
      paramInt = i;
      if (this.udh != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.udh);
      }
      i = paramInt;
      if (this.lPG != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.lPG);
      }
      paramInt = b.a.a.a.fh(10, this.tNb);
      GMTrace.o(3867618050048L, 28816);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3867618050048L, 28816);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ur localur = (ur)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3867618050048L, 28816);
          return -1;
        case 1: 
          localur.lTf = locala.yqV.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 2: 
          localur.jio = locala.yqV.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 3: 
          localur.jhi = locala.yqV.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 4: 
          localur.lQe = locala.yqV.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 5: 
          localur.umU = locala.yqV.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 6: 
          localur.umV = locala.yqV.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 7: 
          localur.tUz = locala.yqV.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 8: 
          localur.udh = locala.yqV.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 9: 
          localur.lPG = locala.yqV.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        }
        localur.tNb = locala.yqV.nj();
        GMTrace.o(3867618050048L, 28816);
        return 0;
      }
      GMTrace.o(3867618050048L, 28816);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */