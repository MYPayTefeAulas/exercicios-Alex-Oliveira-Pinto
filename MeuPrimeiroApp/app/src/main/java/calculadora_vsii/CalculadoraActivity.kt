package calculadora_vsii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import calculadora_vsii.Calculadora
import com.example.meuprimeiroapp.databinding.ActivityCalculadoraBinding

class CalculadoraActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculadoraBinding
    private val calculadora = Calculadora(numero1 = null, numero2 = null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculadoraBinding.inflate(layoutInflater)
        var operacao = 0

        binding.btZeroCalculadora.setOnClickListener(){
            calculadora.numero1 = 0.0
            binding.txtExpressao.text = "${calculadora.numero1}"
            binding.btCCalculadora.setOnClickListener(){
                binding.txtExpressao.text = ""
                calculadora.numero1 = null
            }
        }

        binding.btUmCalculadora.setOnClickListener(){
            calculadora.numero1 = 1.0
            binding.txtExpressao.text = "${calculadora.numero1}"
            binding.btCCalculadora.setOnClickListener(){
                binding.txtExpressao.text = ""
                calculadora.numero1 = null
            }
        }

        binding.btDoisCalculadora.setOnClickListener(){
            calculadora.numero1 = 2.0
            binding.txtExpressao.text = "${calculadora.numero1}"
            binding.btCCalculadora.setOnClickListener(){
                binding.txtExpressao.text = ""
                calculadora.numero1 = null
            }
        }

        binding.btTresCalculadora.setOnClickListener(){
            calculadora.numero1 = 3.0
            binding.txtExpressao.text = "${calculadora.numero1}"
            binding.btCCalculadora.setOnClickListener(){
                binding.txtExpressao.text = ""
                calculadora.numero1 = null
            }
        }

        binding.btQuatroCalculadora.setOnClickListener(){
            calculadora.numero1 = 4.0
            binding.txtExpressao.text = "${calculadora.numero1}"
            binding.btCCalculadora.setOnClickListener(){
                binding.txtExpressao.text = ""
                calculadora.numero1 = null
            }
        }

        binding.btCincoCalculadora.setOnClickListener(){
            calculadora.numero1 = 5.0
            binding.txtExpressao.text = "${calculadora.numero1}"
            binding.btCCalculadora.setOnClickListener(){
                binding.txtExpressao.text = ""
                calculadora.numero1 = null
            }
        }

        binding.btSeisCalculadora.setOnClickListener(){
            calculadora.numero1 = 6.0
            binding.txtExpressao.text = "${calculadora.numero1}"
            binding.btCCalculadora.setOnClickListener(){
                binding.txtExpressao.text = ""
                calculadora.numero1 = null
            }
        }

        binding.btSeteCalculadora.setOnClickListener(){
            calculadora.numero1 = 7.0
            binding.txtExpressao.text = "${calculadora.numero1}"
            binding.btCCalculadora.setOnClickListener(){
                binding.txtExpressao.text = ""
                calculadora.numero1 = null
            }
        }

        binding.btOitoCalculadora.setOnClickListener(){
            calculadora.numero1 = 8.0
            binding.txtExpressao.text = "${calculadora.numero1}"
            binding.btCCalculadora.setOnClickListener(){
                binding.txtExpressao.text = ""
                calculadora.numero1 = null
            }
        }

        binding.btNoveCalculadora.setOnClickListener(){
            calculadora.numero1 = 9.0
            binding.txtExpressao.text = "${calculadora.numero1}"
            binding.btCCalculadora.setOnClickListener(){
                binding.txtExpressao.text = ""
                calculadora.numero1 = null
            }
        }

        binding.btAdicaoCalculadora.setOnClickListener(){
            operacao = 1
            binding.txtExpressao.text = "${calculadora.numero1} + "
            binding.btCCalculadora.setOnClickListener(){
                operacao = 0
                binding.txtExpressao.text = "${calculadora.numero1}"

                binding.btCCalculadora.setOnClickListener(){
                    binding.txtExpressao.text = ""
                    calculadora.numero1 = null
                }
            }

            if(operacao == 1){
                binding.btZeroCalculadora.setOnClickListener(){
                    calculadora.numero2 = 0.0
                    binding.txtExpressao.text = "${calculadora.numero1} + ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.plus(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} + "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btUmCalculadora.setOnClickListener(){
                    calculadora.numero2 = 1.0
                    binding.txtExpressao.text = "${calculadora.numero1} + ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.plus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} + "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btDoisCalculadora.setOnClickListener(){
                    calculadora.numero2 = 2.0
                    binding.txtExpressao.text = "${calculadora.numero1} + ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.plus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} + "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btTresCalculadora.setOnClickListener(){
                    calculadora.numero2 = 3.0
                    binding.txtExpressao.text = "${calculadora.numero1} + ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.plus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} + "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btQuatroCalculadora.setOnClickListener(){
                    calculadora.numero2 = 4.0
                    binding.txtExpressao.text = "${calculadora.numero1} + ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.plus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} + "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"
                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btCincoCalculadora.setOnClickListener(){
                    calculadora.numero2 = 5.0
                    binding.txtExpressao.text = "${calculadora.numero1} + ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.plus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} + "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"
                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btSeisCalculadora.setOnClickListener(){
                    calculadora.numero2 = 6.0
                    binding.txtExpressao.text = "${calculadora.numero1} + ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.plus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} + "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btSeteCalculadora.setOnClickListener(){
                    calculadora.numero2 = 7.0
                    binding.txtExpressao.text = "${calculadora.numero1} + ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.plus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} + "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btOitoCalculadora.setOnClickListener(){
                    calculadora.numero2 = 8.0
                    binding.txtExpressao.text = "${calculadora.numero1} + ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.plus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} + "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btNoveCalculadora.setOnClickListener(){
                    calculadora.numero2 = 9.0
                    binding.txtExpressao.text = "${calculadora.numero1} + ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.plus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} + "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }
            }
        }

        binding.btSubtracaoCalculadora.setOnClickListener(){
            operacao = 2
            binding.txtExpressao.text = "${calculadora.numero1} - "
            binding.btCCalculadora.setOnClickListener(){
                operacao = 0
                binding.txtExpressao.text = "${calculadora.numero1}"

                binding.btCCalculadora.setOnClickListener(){
                    binding.txtExpressao.text = ""
                    calculadora.numero1 = null
                }
            }
            if(operacao == 2){
                binding.btZeroCalculadora.setOnClickListener(){
                    calculadora.numero2 = 0.0
                    binding.txtExpressao.text = "${calculadora.numero1} - ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.minus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} - "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btUmCalculadora.setOnClickListener(){
                    calculadora.numero2 = 1.0
                    binding.txtExpressao.text = "${calculadora.numero1} - ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.minus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} - "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btDoisCalculadora.setOnClickListener(){
                    calculadora.numero2 = 2.0
                    binding.txtExpressao.text = "${calculadora.numero1} - ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.minus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} - "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btTresCalculadora.setOnClickListener(){
                    calculadora.numero2 = 3.0
                    binding.txtExpressao.text = "${calculadora.numero1} - ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.minus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} - "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btQuatroCalculadora.setOnClickListener(){
                    calculadora.numero2 = 4.0
                    binding.txtExpressao.text = "${calculadora.numero1} - ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.minus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} - "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btCincoCalculadora.setOnClickListener(){
                    calculadora.numero2 = 5.0
                    binding.txtExpressao.text = "${calculadora.numero1} - ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.minus(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} - "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btSeisCalculadora.setOnClickListener(){
                    calculadora.numero2 = 6.0
                    binding.txtExpressao.text = "${calculadora.numero1} - ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.minus(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} - "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btSeteCalculadora.setOnClickListener(){
                    calculadora.numero2 = 7.0
                    binding.txtExpressao.text = "${calculadora.numero1} - ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.minus(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} - "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btOitoCalculadora.setOnClickListener(){
                    calculadora.numero2 = 8.0
                    binding.txtExpressao.text = "${calculadora.numero1} - ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.minus(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} - "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btNoveCalculadora.setOnClickListener(){
                    calculadora.numero2 = 9.0
                    binding.txtExpressao.text = "${calculadora.numero1} - ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.minus(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} - "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }
            }
        }

        binding.btMultiplicacaoCalculadora.setOnClickListener(){
            operacao = 3
            binding.txtExpressao.text = "${calculadora.numero1} x "
            binding.btCCalculadora.setOnClickListener(){
                operacao = 0
                binding.txtExpressao.text = "${calculadora.numero1}"

                binding.btCCalculadora.setOnClickListener(){
                    binding.txtExpressao.text = ""
                    calculadora.numero1 = null
                }
            }

            if(operacao == 3){
                binding.btZeroCalculadora.setOnClickListener(){
                    calculadora.numero2 = 0.0
                    binding.txtExpressao.text = "${calculadora.numero1} x ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.times(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} x "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btUmCalculadora.setOnClickListener(){
                    calculadora.numero2 = 1.0
                    binding.txtExpressao.text = "${calculadora.numero1} x ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.times(calculadora.numero2!!)}"
                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} x "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btDoisCalculadora.setOnClickListener(){
                    calculadora.numero2 = 2.0
                    binding.txtExpressao.text = "${calculadora.numero1} x ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.times(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} x "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btTresCalculadora.setOnClickListener(){
                    calculadora.numero2 = 3.0
                    binding.txtExpressao.text = "${calculadora.numero1} x ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.times(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} x "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btQuatroCalculadora.setOnClickListener(){
                    calculadora.numero2 = 4.0
                    binding.txtExpressao.text = "${calculadora.numero1} x ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.times(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} x "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btCincoCalculadora.setOnClickListener(){
                    calculadora.numero2 = 5.0
                    binding.txtExpressao.text = "${calculadora.numero1} x ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.times(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} x "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btSeisCalculadora.setOnClickListener(){
                    calculadora.numero2 = 6.0
                    binding.txtExpressao.text = "${calculadora.numero1} x ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.times(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} x "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btSeteCalculadora.setOnClickListener(){
                    calculadora.numero2 = 7.0
                    binding.txtExpressao.text = "${calculadora.numero1} x ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.times(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} x "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btOitoCalculadora.setOnClickListener(){
                    calculadora.numero2 = 8.0
                    binding.txtExpressao.text = "${calculadora.numero1} x ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.times(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} x "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btNoveCalculadora.setOnClickListener(){
                    calculadora.numero2 = 9.0
                    binding.txtExpressao.text = "${calculadora.numero1} x ${calculadora.numero2}"
                    binding.txtResultado.text = "${calculadora.numero1?.times(calculadora.numero2!!)}"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} x "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }
            }
        }

        binding.btDivisaoCalculadora.setOnClickListener(){
            operacao = 4
            binding.txtExpressao.text = "${calculadora.numero1} / "
            binding.btCCalculadora.setOnClickListener(){
                operacao = 0
                binding.txtExpressao.text = "${calculadora.numero1}"

                binding.btCCalculadora.setOnClickListener(){
                    binding.txtExpressao.text = ""
                    calculadora.numero1 = null
                }
            }
            if(operacao == 4){
                binding.btZeroCalculadora.setOnClickListener(){
                    calculadora.numero2 = 0.0
                    binding.txtExpressao.text = "${calculadora.numero1} / ${calculadora.numero2}"
                    binding.txtResultado.text = "${ calculadora.numero1?.div(calculadora.numero2!!) }"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} / "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btUmCalculadora.setOnClickListener(){
                    calculadora.numero2 = 1.0
                    binding.txtExpressao.text = "${calculadora.numero1} / ${calculadora.numero2}"
                    binding.txtResultado.text = "${ calculadora.numero1?.div(calculadora.numero2!!) }"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} / "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btDoisCalculadora.setOnClickListener(){
                    calculadora.numero2 = 2.0
                    binding.txtExpressao.text = "${calculadora.numero1} / ${calculadora.numero2}"
                    binding.txtResultado.text = "${ calculadora.numero1?.div(calculadora.numero2!!) }"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} / "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btTresCalculadora.setOnClickListener(){
                    calculadora.numero2 = 3.0
                    binding.txtExpressao.text = "${calculadora.numero1} / ${calculadora.numero2}"
                    binding.txtResultado.text = "${ calculadora.numero1?.div(calculadora.numero2!!) }"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} / "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btQuatroCalculadora.setOnClickListener(){
                    calculadora.numero2 = 4.0
                    binding.txtExpressao.text = "${calculadora.numero1} / ${calculadora.numero2}"
                    binding.txtResultado.text = "${ calculadora.numero1?.div(calculadora.numero2!!) }"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} / "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btCincoCalculadora.setOnClickListener(){
                    calculadora.numero2 = 5.0
                    binding.txtExpressao.text = "${calculadora.numero1} / ${calculadora.numero2}"
                    binding.txtResultado.text = "${ calculadora.numero1?.div(calculadora.numero2!!) }"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} / "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btSeisCalculadora.setOnClickListener(){
                    calculadora.numero2 = 6.0
                    binding.txtExpressao.text = "${calculadora.numero1} / ${calculadora.numero2}"
                    binding.txtResultado.text = "${ calculadora.numero1?.div(calculadora.numero2!!) }"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} / "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btSeteCalculadora.setOnClickListener(){
                    calculadora.numero2 = 7.0
                    binding.txtExpressao.text = "${calculadora.numero1} / ${calculadora.numero2}"
                    binding.txtResultado.text = "${ calculadora.numero1?.div(calculadora.numero2!!) }"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} / "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btOitoCalculadora.setOnClickListener(){
                    calculadora.numero2 = 8.0
                    binding.txtExpressao.text = "${calculadora.numero1} / ${calculadora.numero2}"
                    binding.txtResultado.text = "${ calculadora.numero1?.div(calculadora.numero2!!) }"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} / "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }

                binding.btNoveCalculadora.setOnClickListener(){
                    calculadora.numero2 = 9.0
                    binding.txtExpressao.text = "${calculadora.numero1} / ${calculadora.numero2}"
                    binding.txtResultado.text = "${ calculadora.numero1?.div(calculadora.numero2!!) }"

                    binding.btCCalculadora.setOnClickListener(){
                        calculadora.numero2 = null
                        binding.txtExpressao.text = "${calculadora.numero1} / "
                        binding.txtResultado.text = ""

                        binding.btCCalculadora.setOnClickListener(){
                            operacao = 0
                            binding.txtExpressao.text = "${calculadora.numero1}"

                            binding.btCCalculadora.setOnClickListener(){
                                binding.txtExpressao.text = ""
                                calculadora.numero1 = null
                            }
                        }
                    }
                }
            }
        }

        setContentView(binding.root)
    }
}