package app.ubie.kotlingraphqlsample.service

import app.ubie.kotlingraphqlsample.domain.Drug
import app.ubie.kotlingraphqlsample.domain.DrugRepository
import org.springframework.stereotype.Service

@Service
class DrugService(private val repository: DrugRepository) {
    fun updatePrice(yjCode: String, newPrice: Int) = repository.updatePrice(yjCode, newPrice)
    fun getDrugs(yjCode: String): List<Drug> = repository.getDrugs(yjCode)
    fun getDrugs(yjCodes: List<String>): List<Drug> = repository.getDrugs(yjCodes)
}